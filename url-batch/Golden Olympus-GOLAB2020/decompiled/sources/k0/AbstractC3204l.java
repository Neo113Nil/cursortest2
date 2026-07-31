package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.core.view.AbstractC1281a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: k0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3204l implements Cloneable {
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final AbstractC3199g STRAIGHT_PATH_MOTION = new a();
    private static ThreadLocal<androidx.collection.a> sRunningAnimators = new ThreadLocal<>();
    private ArrayList<s> mEndValuesList;
    private e mEpicenterCallback;
    private androidx.collection.a mNameOverrides;
    private ArrayList<s> mStartValuesList;
    private String mName = getClass().getName();
    private long mStartDelay = -1;
    long mDuration = -1;
    private TimeInterpolator mInterpolator = null;
    ArrayList<Integer> mTargetIds = new ArrayList<>();
    ArrayList<View> mTargets = new ArrayList<>();
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class<?>> mTargetTypes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Class<?>> mTargetTypeExcludes = null;
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<Class<?>> mTargetTypeChildExcludes = null;
    private t mStartValues = new t();
    private t mEndValues = new t();
    C3208p mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    boolean mCanRemoveViews = false;
    ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private int mNumInstances = 0;
    private boolean mPaused = false;
    private boolean mEnded = false;
    private ArrayList<f> mListeners = null;
    private ArrayList<Animator> mAnimators = new ArrayList<>();
    private AbstractC3199g mPathMotion = STRAIGHT_PATH_MOTION;

    /* renamed from: k0.l$a */
    class a extends AbstractC3199g {
        a() {
        }

        @Override // k0.AbstractC3199g
        public Path a(float f4, float f5, float f6, float f7) {
            Path path = new Path();
            path.moveTo(f4, f5);
            path.lineTo(f6, f7);
            return path;
        }
    }

    /* renamed from: k0.l$b */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f40953a;

        b(androidx.collection.a aVar) {
            this.f40953a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f40953a.remove(animator);
            AbstractC3204l.this.mCurrentAnimators.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC3204l.this.mCurrentAnimators.add(animator);
        }
    }

    /* renamed from: k0.l$c */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC3204l.this.end();
            animator.removeListener(this);
        }
    }

    /* renamed from: k0.l$d */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        View f40956a;

        /* renamed from: b, reason: collision with root package name */
        String f40957b;

        /* renamed from: c, reason: collision with root package name */
        s f40958c;

        /* renamed from: d, reason: collision with root package name */
        P f40959d;

        /* renamed from: e, reason: collision with root package name */
        AbstractC3204l f40960e;

        d(View view, String str, AbstractC3204l abstractC3204l, P p4, s sVar) {
            this.f40956a = view;
            this.f40957b = str;
            this.f40958c = sVar;
            this.f40959d = p4;
            this.f40960e = abstractC3204l;
        }
    }

    /* renamed from: k0.l$e */
    public static abstract class e {
    }

    /* renamed from: k0.l$f */
    public interface f {
        void onTransitionCancel(AbstractC3204l abstractC3204l);

        void onTransitionEnd(AbstractC3204l abstractC3204l);

        void onTransitionPause(AbstractC3204l abstractC3204l);

        void onTransitionResume(AbstractC3204l abstractC3204l);

        void onTransitionStart(AbstractC3204l abstractC3204l);
    }

    private void a(androidx.collection.a aVar, androidx.collection.a aVar2) {
        for (int i4 = 0; i4 < aVar.size(); i4++) {
            s sVar = (s) aVar.q(i4);
            if (isValidTarget(sVar.f40980b)) {
                this.mStartValuesList.add(sVar);
                this.mEndValuesList.add(null);
            }
        }
        for (int i5 = 0; i5 < aVar2.size(); i5++) {
            s sVar2 = (s) aVar2.q(i5);
            if (isValidTarget(sVar2.f40980b)) {
                this.mEndValuesList.add(sVar2);
                this.mStartValuesList.add(null);
            }
        }
    }

    private static void b(t tVar, View view, s sVar) {
        tVar.f40982a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f40983b.indexOfKey(id) >= 0) {
                tVar.f40983b.put(id, null);
            } else {
                tVar.f40983b.put(id, view);
            }
        }
        String K3 = AbstractC1281a0.K(view);
        if (K3 != null) {
            if (tVar.f40985d.containsKey(K3)) {
                tVar.f40985d.put(K3, null);
            } else {
                tVar.f40985d.put(K3, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f40984c.k(itemIdAtPosition) < 0) {
                    AbstractC1281a0.y0(view, true);
                    tVar.f40984c.m(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) tVar.f40984c.i(itemIdAtPosition);
                if (view2 != null) {
                    AbstractC1281a0.y0(view2, false);
                    tVar.f40984c.m(itemIdAtPosition, null);
                }
            }
        }
    }

    private void c(View view, boolean z4) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.mTargetExcludes;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.mTargetTypeExcludes;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        if (this.mTargetTypeExcludes.get(i4).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    s sVar = new s(view);
                    if (z4) {
                        captureStartValues(sVar);
                    } else {
                        captureEndValues(sVar);
                    }
                    sVar.f40981c.add(this);
                    capturePropagationValues(sVar);
                    if (z4) {
                        b(this.mStartValues, view, sVar);
                    } else {
                        b(this.mEndValues, view, sVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.mTargetChildExcludes;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i5 = 0; i5 < size2; i5++) {
                                    if (this.mTargetTypeChildExcludes.get(i5).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                                c(viewGroup.getChildAt(i6), z4);
                            }
                        }
                    }
                }
            }
        }
    }

    private static androidx.collection.a e() {
        androidx.collection.a aVar = sRunningAnimators.get();
        if (aVar != null) {
            return aVar;
        }
        androidx.collection.a aVar2 = new androidx.collection.a();
        sRunningAnimators.set(aVar2);
        return aVar2;
    }

    private static boolean f(s sVar, s sVar2, String str) {
        Object obj = sVar.f40979a.get(str);
        Object obj2 = sVar2.f40979a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void g(androidx.collection.a aVar, androidx.collection.a aVar2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) sparseArray.valueAt(i4);
            if (view2 != null && isValidTarget(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i4))) != null && isValidTarget(view)) {
                s sVar = (s) aVar.get(view2);
                s sVar2 = (s) aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.mStartValuesList.add(sVar);
                    this.mEndValuesList.add(sVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void h(androidx.collection.a aVar, androidx.collection.a aVar2) {
        s sVar;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.m(size);
            if (view != null && isValidTarget(view) && (sVar = (s) aVar2.remove(view)) != null && isValidTarget(sVar.f40980b)) {
                this.mStartValuesList.add((s) aVar.o(size));
                this.mEndValuesList.add(sVar);
            }
        }
    }

    private void i(androidx.collection.a aVar, androidx.collection.a aVar2, androidx.collection.d dVar, androidx.collection.d dVar2) {
        View view;
        int p4 = dVar.p();
        for (int i4 = 0; i4 < p4; i4++) {
            View view2 = (View) dVar.q(i4);
            if (view2 != null && isValidTarget(view2) && (view = (View) dVar2.i(dVar.l(i4))) != null && isValidTarget(view)) {
                s sVar = (s) aVar.get(view2);
                s sVar2 = (s) aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.mStartValuesList.add(sVar);
                    this.mEndValuesList.add(sVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void j(androidx.collection.a aVar, androidx.collection.a aVar2, androidx.collection.a aVar3, androidx.collection.a aVar4) {
        View view;
        int size = aVar3.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) aVar3.q(i4);
            if (view2 != null && isValidTarget(view2) && (view = (View) aVar4.get(aVar3.m(i4))) != null && isValidTarget(view)) {
                s sVar = (s) aVar.get(view2);
                s sVar2 = (s) aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.mStartValuesList.add(sVar);
                    this.mEndValuesList.add(sVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void k(t tVar, t tVar2) {
        androidx.collection.a aVar = new androidx.collection.a(tVar.f40982a);
        androidx.collection.a aVar2 = new androidx.collection.a(tVar2.f40982a);
        int i4 = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i4 >= iArr.length) {
                a(aVar, aVar2);
                return;
            }
            int i5 = iArr[i4];
            if (i5 == 1) {
                h(aVar, aVar2);
            } else if (i5 == 2) {
                j(aVar, aVar2, tVar.f40985d, tVar2.f40985d);
            } else if (i5 == 3) {
                g(aVar, aVar2, tVar.f40983b, tVar2.f40983b);
            } else if (i5 == 4) {
                i(aVar, aVar2, tVar.f40984c, tVar2.f40984c);
            }
            i4++;
        }
    }

    private void l(Animator animator, androidx.collection.a aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            animate(animator);
        }
    }

    public AbstractC3204l addListener(f fVar) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(fVar);
        return this;
    }

    public AbstractC3204l addTarget(View view) {
        this.mTargets.add(view);
        return this;
    }

    protected void animate(Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(getStartDelay() + animator.getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new c());
        animator.start();
    }

    protected void cancel() {
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            this.mCurrentAnimators.get(size).cancel();
        }
        ArrayList<f> arrayList = this.mListeners;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((f) arrayList2.get(i4)).onTransitionCancel(this);
        }
    }

    public abstract void captureEndValues(s sVar);

    public abstract void captureStartValues(s sVar);

    void captureValues(ViewGroup viewGroup, boolean z4) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        androidx.collection.a aVar;
        clearValues(z4);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i4 = 0; i4 < this.mTargetIds.size(); i4++) {
                View findViewById = viewGroup.findViewById(this.mTargetIds.get(i4).intValue());
                if (findViewById != null) {
                    s sVar = new s(findViewById);
                    if (z4) {
                        captureStartValues(sVar);
                    } else {
                        captureEndValues(sVar);
                    }
                    sVar.f40981c.add(this);
                    capturePropagationValues(sVar);
                    if (z4) {
                        b(this.mStartValues, findViewById, sVar);
                    } else {
                        b(this.mEndValues, findViewById, sVar);
                    }
                }
            }
            for (int i5 = 0; i5 < this.mTargets.size(); i5++) {
                View view = this.mTargets.get(i5);
                s sVar2 = new s(view);
                if (z4) {
                    captureStartValues(sVar2);
                } else {
                    captureEndValues(sVar2);
                }
                sVar2.f40981c.add(this);
                capturePropagationValues(sVar2);
                if (z4) {
                    b(this.mStartValues, view, sVar2);
                } else {
                    b(this.mEndValues, view, sVar2);
                }
            }
        } else {
            c(viewGroup, z4);
        }
        if (z4 || (aVar = this.mNameOverrides) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i6 = 0; i6 < size; i6++) {
            arrayList3.add(this.mStartValues.f40985d.remove((String) this.mNameOverrides.m(i6)));
        }
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = (View) arrayList3.get(i7);
            if (view2 != null) {
                this.mStartValues.f40985d.put((String) this.mNameOverrides.q(i7), view2);
            }
        }
    }

    void clearValues(boolean z4) {
        if (z4) {
            this.mStartValues.f40982a.clear();
            this.mStartValues.f40983b.clear();
            this.mStartValues.f40984c.a();
        } else {
            this.mEndValues.f40982a.clear();
            this.mEndValues.f40983b.clear();
            this.mEndValues.f40984c.a();
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    protected void createAnimators(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        View view;
        Animator animator;
        s sVar;
        View view2;
        Animator animator2;
        androidx.collection.a e4 = e();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            s sVar2 = arrayList.get(i4);
            s sVar3 = arrayList2.get(i4);
            if (sVar2 != null && !sVar2.f40981c.contains(this)) {
                sVar2 = null;
            }
            if (sVar3 != null && !sVar3.f40981c.contains(this)) {
                sVar3 = null;
            }
            if ((sVar2 != null || sVar3 != null) && (sVar2 == null || sVar3 == null || isTransitionRequired(sVar2, sVar3))) {
                Animator createAnimator = createAnimator(viewGroup, sVar2, sVar3);
                if (createAnimator != null) {
                    if (sVar3 != null) {
                        View view3 = sVar3.f40980b;
                        String[] transitionProperties = getTransitionProperties();
                        if (transitionProperties != null && transitionProperties.length > 0) {
                            sVar = new s(view3);
                            s sVar4 = (s) tVar2.f40982a.get(view3);
                            if (sVar4 != null) {
                                int i5 = 0;
                                while (i5 < transitionProperties.length) {
                                    Map map = sVar.f40979a;
                                    String[] strArr = transitionProperties;
                                    String str = strArr[i5];
                                    map.put(str, sVar4.f40979a.get(str));
                                    i5++;
                                    transitionProperties = strArr;
                                }
                            }
                            int size2 = e4.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size2) {
                                    view2 = view3;
                                    animator2 = createAnimator;
                                    break;
                                }
                                d dVar = (d) e4.get((Animator) e4.m(i6));
                                if (dVar.f40958c != null && dVar.f40956a == view3) {
                                    view2 = view3;
                                    if (dVar.f40957b.equals(getName()) && dVar.f40958c.equals(sVar)) {
                                        animator2 = null;
                                        break;
                                    }
                                } else {
                                    view2 = view3;
                                }
                                i6++;
                                view3 = view2;
                            }
                        } else {
                            view2 = view3;
                            animator2 = createAnimator;
                            sVar = null;
                        }
                        animator = animator2;
                        view = view2;
                    } else {
                        view = sVar2.f40980b;
                        animator = createAnimator;
                        sVar = null;
                    }
                    if (animator != null) {
                        e4.put(animator, new d(view, getName(), this, AbstractC3188A.d(viewGroup), sVar));
                        this.mAnimators.add(animator);
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator3 = this.mAnimators.get(sparseIntArray.keyAt(i7));
                animator3.setStartDelay((sparseIntArray.valueAt(i7) - Long.MAX_VALUE) + animator3.getStartDelay());
            }
        }
    }

    protected void end() {
        int i4 = this.mNumInstances - 1;
        this.mNumInstances = i4;
        if (i4 == 0) {
            ArrayList<f> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((f) arrayList2.get(i5)).onTransitionEnd(this);
                }
            }
            for (int i6 = 0; i6 < this.mStartValues.f40984c.p(); i6++) {
                View view = (View) this.mStartValues.f40984c.q(i6);
                if (view != null) {
                    AbstractC1281a0.y0(view, false);
                }
            }
            for (int i7 = 0; i7 < this.mEndValues.f40984c.p(); i7++) {
                View view2 = (View) this.mEndValues.f40984c.q(i7);
                if (view2 != null) {
                    AbstractC1281a0.y0(view2, false);
                }
            }
            this.mEnded = true;
        }
    }

    void forceToEnd(ViewGroup viewGroup) {
        androidx.collection.a e4 = e();
        int size = e4.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        P d4 = AbstractC3188A.d(viewGroup);
        androidx.collection.a aVar = new androidx.collection.a(e4);
        e4.clear();
        for (int i4 = size - 1; i4 >= 0; i4--) {
            d dVar = (d) aVar.q(i4);
            if (dVar.f40956a != null && d4 != null && d4.equals(dVar.f40959d)) {
                ((Animator) aVar.m(i4)).end();
            }
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    public e getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    s getMatchedTransitionValues(View view, boolean z4) {
        C3208p c3208p = this.mParent;
        if (c3208p != null) {
            return c3208p.getMatchedTransitionValues(view, z4);
        }
        ArrayList<s> arrayList = z4 ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            }
            s sVar = arrayList.get(i4);
            if (sVar == null) {
                return null;
            }
            if (sVar.f40980b == view) {
                break;
            }
            i4++;
        }
        if (i4 >= 0) {
            return (z4 ? this.mEndValuesList : this.mStartValuesList).get(i4);
        }
        return null;
    }

    public String getName() {
        return this.mName;
    }

    public AbstractC3199g getPathMotion() {
        return this.mPathMotion;
    }

    public AbstractC3207o getPropagation() {
        return null;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    public List<Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    public List<View> getTargets() {
        return this.mTargets;
    }

    public String[] getTransitionProperties() {
        return null;
    }

    public s getTransitionValues(View view, boolean z4) {
        C3208p c3208p = this.mParent;
        if (c3208p != null) {
            return c3208p.getTransitionValues(view, z4);
        }
        return (s) (z4 ? this.mStartValues : this.mEndValues).f40982a.get(view);
    }

    public boolean isTransitionRequired(s sVar, s sVar2) {
        if (sVar != null && sVar2 != null) {
            String[] transitionProperties = getTransitionProperties();
            if (transitionProperties != null) {
                for (String str : transitionProperties) {
                    if (f(sVar, sVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = sVar.f40979a.keySet().iterator();
                while (it.hasNext()) {
                    if (f(sVar, sVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean isValidTarget(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (this.mTargetTypeExcludes.get(i4).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null && AbstractC1281a0.K(view) != null && this.mTargetNameExcludes.contains(AbstractC1281a0.K(view))) {
            return false;
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null && arrayList6.contains(AbstractC1281a0.K(view))) {
            return true;
        }
        if (this.mTargetTypes != null) {
            for (int i5 = 0; i5 < this.mTargetTypes.size(); i5++) {
                if (this.mTargetTypes.get(i5).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void pause(View view) {
        if (this.mEnded) {
            return;
        }
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            AbstractC3193a.b(this.mCurrentAnimators.get(size));
        }
        ArrayList<f> arrayList = this.mListeners;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((f) arrayList2.get(i4)).onTransitionPause(this);
            }
        }
        this.mPaused = true;
    }

    void playTransition(ViewGroup viewGroup) {
        d dVar;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        k(this.mStartValues, this.mEndValues);
        androidx.collection.a e4 = e();
        int size = e4.size();
        P d4 = AbstractC3188A.d(viewGroup);
        for (int i4 = size - 1; i4 >= 0; i4--) {
            Animator animator = (Animator) e4.m(i4);
            if (animator != null && (dVar = (d) e4.get(animator)) != null && dVar.f40956a != null && d4.equals(dVar.f40959d)) {
                s sVar = dVar.f40958c;
                View view = dVar.f40956a;
                s transitionValues = getTransitionValues(view, true);
                s matchedTransitionValues = getMatchedTransitionValues(view, true);
                if (transitionValues == null && matchedTransitionValues == null) {
                    matchedTransitionValues = (s) this.mEndValues.f40982a.get(view);
                }
                if ((transitionValues != null || matchedTransitionValues != null) && dVar.f40960e.isTransitionRequired(sVar, matchedTransitionValues)) {
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        e4.remove(animator);
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        runAnimators();
    }

    public AbstractC3204l removeListener(f fVar) {
        ArrayList<f> arrayList = this.mListeners;
        if (arrayList != null) {
            arrayList.remove(fVar);
            if (this.mListeners.size() == 0) {
                this.mListeners = null;
            }
        }
        return this;
    }

    public AbstractC3204l removeTarget(View view) {
        this.mTargets.remove(view);
        return this;
    }

    public void resume(View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
                    AbstractC3193a.c(this.mCurrentAnimators.get(size));
                }
                ArrayList<f> arrayList = this.mListeners;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                    int size2 = arrayList2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        ((f) arrayList2.get(i4)).onTransitionResume(this);
                    }
                }
            }
            this.mPaused = false;
        }
    }

    protected void runAnimators() {
        start();
        androidx.collection.a e4 = e();
        ArrayList<Animator> arrayList = this.mAnimators;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Animator animator = arrayList.get(i4);
            i4++;
            Animator animator2 = animator;
            if (e4.containsKey(animator2)) {
                start();
                l(animator2, e4);
            }
        }
        this.mAnimators.clear();
        end();
    }

    void setCanRemoveViews(boolean z4) {
        this.mCanRemoveViews = z4;
    }

    public AbstractC3204l setDuration(long j4) {
        this.mDuration = j4;
        return this;
    }

    public void setEpicenterCallback(e eVar) {
        this.mEpicenterCallback = eVar;
    }

    public AbstractC3204l setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setPathMotion(AbstractC3199g abstractC3199g) {
        if (abstractC3199g == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = abstractC3199g;
        }
    }

    public AbstractC3204l setStartDelay(long j4) {
        this.mStartDelay = j4;
        return this;
    }

    protected void start() {
        if (this.mNumInstances == 0) {
            ArrayList<f> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((f) arrayList2.get(i4)).onTransitionStart(this);
                }
            }
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public String toString() {
        return toString("");
    }

    public AbstractC3204l addTarget(int i4) {
        if (i4 != 0) {
            this.mTargetIds.add(Integer.valueOf(i4));
        }
        return this;
    }

    @Override // 
    public AbstractC3204l clone() {
        try {
            AbstractC3204l abstractC3204l = (AbstractC3204l) super.clone();
            abstractC3204l.mAnimators = new ArrayList<>();
            abstractC3204l.mStartValues = new t();
            abstractC3204l.mEndValues = new t();
            abstractC3204l.mStartValuesList = null;
            abstractC3204l.mEndValuesList = null;
            return abstractC3204l;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    String toString(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.mDuration != -1) {
            str2 = str2 + "dur(" + this.mDuration + ") ";
        }
        if (this.mStartDelay != -1) {
            str2 = str2 + "dly(" + this.mStartDelay + ") ";
        }
        if (this.mInterpolator != null) {
            str2 = str2 + "interp(" + this.mInterpolator + ") ";
        }
        if (this.mTargetIds.size() <= 0 && this.mTargets.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.mTargetIds.size() > 0) {
            for (int i4 = 0; i4 < this.mTargetIds.size(); i4++) {
                if (i4 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.mTargetIds.get(i4);
            }
        }
        if (this.mTargets.size() > 0) {
            for (int i5 = 0; i5 < this.mTargets.size(); i5++) {
                if (i5 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.mTargets.get(i5);
            }
        }
        return str3 + ")";
    }

    void capturePropagationValues(s sVar) {
    }

    public void setPropagation(AbstractC3207o abstractC3207o) {
    }
}
