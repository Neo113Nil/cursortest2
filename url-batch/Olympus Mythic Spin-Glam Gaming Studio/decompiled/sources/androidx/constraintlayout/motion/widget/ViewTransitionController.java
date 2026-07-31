package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.SharedValues;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes11.dex */
public class ViewTransitionController {
    ArrayList animations;
    private final MotionLayout mMotionLayout;
    private HashSet mRelatedViews;
    private ArrayList viewTransitions = new ArrayList();
    private String TAG = "ViewTransitionController";
    ArrayList removeList = new ArrayList();

    public ViewTransitionController(MotionLayout motionLayout) {
        this.mMotionLayout = motionLayout;
    }

    public void add(ViewTransition viewTransition) {
        this.viewTransitions.add(viewTransition);
        this.mRelatedViews = null;
        if (viewTransition.getStateTransition() == 4) {
            listenForSharedVariable(viewTransition, true);
        } else if (viewTransition.getStateTransition() == 5) {
            listenForSharedVariable(viewTransition, false);
        }
    }

    private void viewTransition(ViewTransition viewTransition, View... viewArr) {
        int currentState = this.mMotionLayout.getCurrentState();
        if (viewTransition.mViewTransitionMode == 2) {
            viewTransition.applyTransition(this, this.mMotionLayout, currentState, null, viewArr);
            return;
        }
        if (currentState == -1) {
            Log.w(this.TAG, "No support for ViewTransition within transition yet. Currently: " + this.mMotionLayout.toString());
            return;
        }
        ConstraintSet constraintSet = this.mMotionLayout.getConstraintSet(currentState);
        if (constraintSet == null) {
            return;
        }
        viewTransition.applyTransition(this, this.mMotionLayout, currentState, constraintSet, viewArr);
    }

    void viewTransition(int i, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.viewTransitions.iterator();
        ViewTransition viewTransition = null;
        while (it.hasNext()) {
            ViewTransition viewTransition2 = (ViewTransition) it.next();
            if (viewTransition2.getId() == i) {
                for (View view : viewArr) {
                    if (viewTransition2.checkTags(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    viewTransition(viewTransition2, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                viewTransition = viewTransition2;
            }
        }
        if (viewTransition == null) {
            Log.e(this.TAG, " Could not find ViewTransition");
        }
    }

    void touchEvent(MotionEvent motionEvent) {
        int currentState = this.mMotionLayout.getCurrentState();
        if (currentState == -1) {
            return;
        }
        if (this.mRelatedViews == null) {
            this.mRelatedViews = new HashSet();
            Iterator it = this.viewTransitions.iterator();
            while (it.hasNext()) {
                ViewTransition viewTransition = (ViewTransition) it.next();
                int childCount = this.mMotionLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.mMotionLayout.getChildAt(i);
                    if (viewTransition.matchesView(childAt)) {
                        childAt.getId();
                        this.mRelatedViews.add(childAt);
                    }
                }
            }
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        Rect rect = new Rect();
        int action = motionEvent.getAction();
        ArrayList arrayList = this.animations;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it2 = this.animations.iterator();
            while (it2.hasNext()) {
                ((ViewTransition.Animate) it2.next()).reactTo(action, x, y);
            }
        }
        if (action == 0 || action == 1) {
            ConstraintSet constraintSet = this.mMotionLayout.getConstraintSet(currentState);
            Iterator it3 = this.viewTransitions.iterator();
            while (it3.hasNext()) {
                ViewTransition viewTransition2 = (ViewTransition) it3.next();
                if (viewTransition2.supports(action)) {
                    Iterator it4 = this.mRelatedViews.iterator();
                    while (it4.hasNext()) {
                        View view = (View) it4.next();
                        if (viewTransition2.matchesView(view)) {
                            view.getHitRect(rect);
                            if (rect.contains((int) x, (int) y)) {
                                viewTransition2.applyTransition(this, this.mMotionLayout, currentState, constraintSet, view);
                            }
                        }
                    }
                }
            }
        }
    }

    void addAnimation(ViewTransition.Animate animate) {
        if (this.animations == null) {
            this.animations = new ArrayList();
        }
        this.animations.add(animate);
    }

    void removeAnimation(ViewTransition.Animate animate) {
        this.removeList.add(animate);
    }

    void animate() {
        ArrayList arrayList = this.animations;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ViewTransition.Animate) it.next()).mutate();
        }
        this.animations.removeAll(this.removeList);
        this.removeList.clear();
        if (this.animations.isEmpty()) {
            this.animations = null;
        }
    }

    void invalidate() {
        this.mMotionLayout.invalidate();
    }

    boolean applyViewTransition(int i, MotionController motionController) {
        Iterator it = this.viewTransitions.iterator();
        while (it.hasNext()) {
            ViewTransition viewTransition = (ViewTransition) it.next();
            if (viewTransition.getId() == i) {
                viewTransition.mKeyFrames.addAllFrames(motionController);
                return true;
            }
        }
        return false;
    }

    private void listenForSharedVariable(final ViewTransition viewTransition, final boolean z) {
        final int sharedValueID = viewTransition.getSharedValueID();
        final int sharedValue = viewTransition.getSharedValue();
        ConstraintLayout.getSharedValues().addListener(viewTransition.getSharedValueID(), new SharedValues.SharedValuesListener() { // from class: androidx.constraintlayout.motion.widget.ViewTransitionController.1
        });
    }
}
