package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.ArrayMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes13.dex */
public class TransitionManager {
    private static Transition sDefaultTransition = new AutoTransition();
    private static ThreadLocal sRunningTransitions = new ThreadLocal();
    static ArrayList sPendingTransitions = new ArrayList();

    private static void changeScene(Scene scene, Transition transition) {
        ViewGroup sceneRoot = scene.getSceneRoot();
        if (sPendingTransitions.contains(sceneRoot)) {
            return;
        }
        Scene currentScene = Scene.getCurrentScene(sceneRoot);
        if (transition == null) {
            if (currentScene != null) {
                currentScene.exit();
            }
            scene.enter();
            return;
        }
        sPendingTransitions.add(sceneRoot);
        Transition mo2881clone = transition.mo2881clone();
        if (currentScene != null && currentScene.isCreatedFromLayoutResource()) {
            mo2881clone.setCanRemoveViews(true);
        }
        sceneChangeSetup(sceneRoot, mo2881clone);
        scene.enter();
        sceneChangeRunTransition(sceneRoot, mo2881clone);
    }

    static ArrayMap getRunningTransitions() {
        ArrayMap arrayMap;
        WeakReference weakReference = (WeakReference) sRunningTransitions.get();
        if (weakReference != null && (arrayMap = (ArrayMap) weakReference.get()) != null) {
            return arrayMap;
        }
        ArrayMap arrayMap2 = new ArrayMap();
        sRunningTransitions.set(new WeakReference(arrayMap2));
        return arrayMap2;
    }

    private static void sceneChangeRunTransition(ViewGroup viewGroup, Transition transition) {
        if (transition == null || viewGroup == null) {
            return;
        }
        MultiListener multiListener = new MultiListener(transition, viewGroup);
        viewGroup.addOnAttachStateChangeListener(multiListener);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(multiListener);
    }

    private static class MultiListener implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        ViewGroup mSceneRoot;
        Transition mTransition;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        MultiListener(Transition transition, ViewGroup viewGroup) {
            this.mTransition = transition;
            this.mSceneRoot = viewGroup;
        }

        private void removeListeners() {
            this.mSceneRoot.getViewTreeObserver().removeOnPreDrawListener(this);
            this.mSceneRoot.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            removeListeners();
            TransitionManager.sPendingTransitions.remove(this.mSceneRoot);
            ArrayList arrayList = (ArrayList) TransitionManager.getRunningTransitions().get(this.mSceneRoot);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).resume(this.mSceneRoot);
                }
            }
            this.mTransition.clearValues(true);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            removeListeners();
            if (!TransitionManager.sPendingTransitions.remove(this.mSceneRoot)) {
                return true;
            }
            final ArrayMap runningTransitions = TransitionManager.getRunningTransitions();
            ArrayList arrayList = (ArrayList) runningTransitions.get(this.mSceneRoot);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                runningTransitions.put(this.mSceneRoot, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.mTransition);
            this.mTransition.addListener(new TransitionListenerAdapter() { // from class: androidx.transition.TransitionManager.MultiListener.1
                @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition) {
                    ((ArrayList) runningTransitions.get(MultiListener.this.mSceneRoot)).remove(transition);
                    transition.removeListener(this);
                }
            });
            this.mTransition.captureValues(this.mSceneRoot, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).resume(this.mSceneRoot);
                }
            }
            this.mTransition.playTransition(this.mSceneRoot);
            return true;
        }
    }

    private static void sceneChangeSetup(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = (ArrayList) getRunningTransitions().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).pause(viewGroup);
            }
        }
        if (transition != null) {
            transition.captureValues(viewGroup, true);
        }
        Scene currentScene = Scene.getCurrentScene(viewGroup);
        if (currentScene != null) {
            currentScene.exit();
        }
    }

    public static void go(Scene scene, Transition transition) {
        changeScene(scene, transition);
    }

    public static void beginDelayedTransition(ViewGroup viewGroup) {
        beginDelayedTransition(viewGroup, null);
    }

    public static void beginDelayedTransition(ViewGroup viewGroup, Transition transition) {
        if (sPendingTransitions.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        sPendingTransitions.add(viewGroup);
        if (transition == null) {
            transition = sDefaultTransition;
        }
        Transition mo2881clone = transition.mo2881clone();
        sceneChangeSetup(viewGroup, mo2881clone);
        Scene.setCurrentScene(viewGroup, null);
        sceneChangeRunTransition(viewGroup, mo2881clone);
    }

    public static void endTransitions(ViewGroup viewGroup) {
        sPendingTransitions.remove(viewGroup);
        ArrayList arrayList = (ArrayList) getRunningTransitions().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((Transition) arrayList2.get(size)).forceToEnd(viewGroup);
        }
    }
}
