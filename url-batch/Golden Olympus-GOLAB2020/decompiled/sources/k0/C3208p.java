package k0;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import k0.AbstractC3204l;

/* renamed from: k0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3208p extends AbstractC3204l {

    /* renamed from: d, reason: collision with root package name */
    int f40970d;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f40968b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f40969c = true;

    /* renamed from: e, reason: collision with root package name */
    boolean f40971e = false;

    /* renamed from: f, reason: collision with root package name */
    private int f40972f = 0;

    /* renamed from: k0.p$a */
    class a extends AbstractC3205m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC3204l f40973a;

        a(AbstractC3204l abstractC3204l) {
            this.f40973a = abstractC3204l;
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionEnd(AbstractC3204l abstractC3204l) {
            this.f40973a.runAnimators();
            abstractC3204l.removeListener(this);
        }
    }

    /* renamed from: k0.p$b */
    static class b extends AbstractC3205m {

        /* renamed from: a, reason: collision with root package name */
        C3208p f40975a;

        b(C3208p c3208p) {
            this.f40975a = c3208p;
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionEnd(AbstractC3204l abstractC3204l) {
            C3208p c3208p = this.f40975a;
            int i4 = c3208p.f40970d - 1;
            c3208p.f40970d = i4;
            if (i4 == 0) {
                c3208p.f40971e = false;
                c3208p.end();
            }
            abstractC3204l.removeListener(this);
        }

        @Override // k0.AbstractC3205m, k0.AbstractC3204l.f
        public void onTransitionStart(AbstractC3204l abstractC3204l) {
            C3208p c3208p = this.f40975a;
            if (c3208p.f40971e) {
                return;
            }
            c3208p.start();
            this.f40975a.f40971e = true;
        }
    }

    private void q(AbstractC3204l abstractC3204l) {
        this.f40968b.add(abstractC3204l);
        abstractC3204l.mParent = this;
    }

    private void z() {
        b bVar = new b(this);
        ArrayList arrayList = this.f40968b;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((AbstractC3204l) obj).addListener(bVar);
        }
        this.f40970d = this.f40968b.size();
    }

    @Override // k0.AbstractC3204l
    protected void cancel() {
        super.cancel();
        int size = this.f40968b.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((AbstractC3204l) this.f40968b.get(i4)).cancel();
        }
    }

    @Override // k0.AbstractC3204l
    public void captureEndValues(s sVar) {
        if (isValidTarget(sVar.f40980b)) {
            ArrayList arrayList = this.f40968b;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                AbstractC3204l abstractC3204l = (AbstractC3204l) obj;
                if (abstractC3204l.isValidTarget(sVar.f40980b)) {
                    abstractC3204l.captureEndValues(sVar);
                    sVar.f40981c.add(abstractC3204l);
                }
            }
        }
    }

    @Override // k0.AbstractC3204l
    void capturePropagationValues(s sVar) {
        super.capturePropagationValues(sVar);
        int size = this.f40968b.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((AbstractC3204l) this.f40968b.get(i4)).capturePropagationValues(sVar);
        }
    }

    @Override // k0.AbstractC3204l
    public void captureStartValues(s sVar) {
        if (isValidTarget(sVar.f40980b)) {
            ArrayList arrayList = this.f40968b;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                AbstractC3204l abstractC3204l = (AbstractC3204l) obj;
                if (abstractC3204l.isValidTarget(sVar.f40980b)) {
                    abstractC3204l.captureStartValues(sVar);
                    sVar.f40981c.add(abstractC3204l);
                }
            }
        }
    }

    @Override // k0.AbstractC3204l
    protected void createAnimators(ViewGroup viewGroup, t tVar, t tVar2, ArrayList arrayList, ArrayList arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f40968b.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC3204l abstractC3204l = (AbstractC3204l) this.f40968b.get(i4);
            if (startDelay > 0 && (this.f40969c || i4 == 0)) {
                long startDelay2 = abstractC3204l.getStartDelay();
                if (startDelay2 > 0) {
                    abstractC3204l.setStartDelay(startDelay2 + startDelay);
                } else {
                    abstractC3204l.setStartDelay(startDelay);
                }
            }
            abstractC3204l.createAnimators(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    @Override // k0.AbstractC3204l
    void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.f40968b.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((AbstractC3204l) this.f40968b.get(i4)).forceToEnd(viewGroup);
        }
    }

    @Override // k0.AbstractC3204l
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C3208p addListener(AbstractC3204l.f fVar) {
        return (C3208p) super.addListener(fVar);
    }

    @Override // k0.AbstractC3204l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C3208p addTarget(int i4) {
        for (int i5 = 0; i5 < this.f40968b.size(); i5++) {
            ((AbstractC3204l) this.f40968b.get(i5)).addTarget(i4);
        }
        return (C3208p) super.addTarget(i4);
    }

    @Override // k0.AbstractC3204l
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C3208p addTarget(View view) {
        for (int i4 = 0; i4 < this.f40968b.size(); i4++) {
            ((AbstractC3204l) this.f40968b.get(i4)).addTarget(view);
        }
        return (C3208p) super.addTarget(view);
    }

    public C3208p p(AbstractC3204l abstractC3204l) {
        q(abstractC3204l);
        long j4 = this.mDuration;
        if (j4 >= 0) {
            abstractC3204l.setDuration(j4);
        }
        if ((this.f40972f & 1) != 0) {
            abstractC3204l.setInterpolator(getInterpolator());
        }
        if ((this.f40972f & 2) != 0) {
            getPropagation();
            abstractC3204l.setPropagation(null);
        }
        if ((this.f40972f & 4) != 0) {
            abstractC3204l.setPathMotion(getPathMotion());
        }
        if ((this.f40972f & 8) != 0) {
            abstractC3204l.setEpicenterCallback(getEpicenterCallback());
        }
        return this;
    }

    @Override // k0.AbstractC3204l
    public void pause(View view) {
        super.pause(view);
        int size = this.f40968b.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((AbstractC3204l) this.f40968b.get(i4)).pause(view);
        }
    }

    public AbstractC3204l r(int i4) {
        if (i4 < 0 || i4 >= this.f40968b.size()) {
            return null;
        }
        return (AbstractC3204l) this.f40968b.get(i4);
    }

    @Override // k0.AbstractC3204l
    public void resume(View view) {
        super.resume(view);
        int size = this.f40968b.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((AbstractC3204l) this.f40968b.get(i4)).resume(view);
        }
    }

    @Override // k0.AbstractC3204l
    protected void runAnimators() {
        if (this.f40968b.isEmpty()) {
            start();
            end();
            return;
        }
        z();
        int i4 = 0;
        if (this.f40969c) {
            ArrayList arrayList = this.f40968b;
            int size = arrayList.size();
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((AbstractC3204l) obj).runAnimators();
            }
            return;
        }
        for (int i5 = 1; i5 < this.f40968b.size(); i5++) {
            ((AbstractC3204l) this.f40968b.get(i5 - 1)).addListener(new a((AbstractC3204l) this.f40968b.get(i5)));
        }
        AbstractC3204l abstractC3204l = (AbstractC3204l) this.f40968b.get(0);
        if (abstractC3204l != null) {
            abstractC3204l.runAnimators();
        }
    }

    public int s() {
        return this.f40968b.size();
    }

    @Override // k0.AbstractC3204l
    void setCanRemoveViews(boolean z4) {
        super.setCanRemoveViews(z4);
        int size = this.f40968b.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((AbstractC3204l) this.f40968b.get(i4)).setCanRemoveViews(z4);
        }
    }

    @Override // k0.AbstractC3204l
    public void setEpicenterCallback(AbstractC3204l.e eVar) {
        super.setEpicenterCallback(eVar);
        this.f40972f |= 8;
        int size = this.f40968b.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((AbstractC3204l) this.f40968b.get(i4)).setEpicenterCallback(eVar);
        }
    }

    @Override // k0.AbstractC3204l
    public void setPathMotion(AbstractC3199g abstractC3199g) {
        super.setPathMotion(abstractC3199g);
        this.f40972f |= 4;
        if (this.f40968b != null) {
            for (int i4 = 0; i4 < this.f40968b.size(); i4++) {
                ((AbstractC3204l) this.f40968b.get(i4)).setPathMotion(abstractC3199g);
            }
        }
    }

    @Override // k0.AbstractC3204l
    public void setPropagation(AbstractC3207o abstractC3207o) {
        super.setPropagation(abstractC3207o);
        this.f40972f |= 2;
        int size = this.f40968b.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((AbstractC3204l) this.f40968b.get(i4)).setPropagation(abstractC3207o);
        }
    }

    @Override // k0.AbstractC3204l
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public C3208p removeListener(AbstractC3204l.f fVar) {
        return (C3208p) super.removeListener(fVar);
    }

    @Override // k0.AbstractC3204l
    String toString(String str) {
        String abstractC3204l = super.toString(str);
        for (int i4 = 0; i4 < this.f40968b.size(); i4++) {
            StringBuilder sb = new StringBuilder();
            sb.append(abstractC3204l);
            sb.append("\n");
            sb.append(((AbstractC3204l) this.f40968b.get(i4)).toString(str + "  "));
            abstractC3204l = sb.toString();
        }
        return abstractC3204l;
    }

    @Override // k0.AbstractC3204l
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public C3208p removeTarget(View view) {
        for (int i4 = 0; i4 < this.f40968b.size(); i4++) {
            ((AbstractC3204l) this.f40968b.get(i4)).removeTarget(view);
        }
        return (C3208p) super.removeTarget(view);
    }

    @Override // k0.AbstractC3204l
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public C3208p setDuration(long j4) {
        ArrayList arrayList;
        super.setDuration(j4);
        if (this.mDuration >= 0 && (arrayList = this.f40968b) != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((AbstractC3204l) this.f40968b.get(i4)).setDuration(j4);
            }
        }
        return this;
    }

    @Override // k0.AbstractC3204l
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public C3208p setInterpolator(TimeInterpolator timeInterpolator) {
        this.f40972f |= 1;
        ArrayList arrayList = this.f40968b;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((AbstractC3204l) this.f40968b.get(i4)).setInterpolator(timeInterpolator);
            }
        }
        return (C3208p) super.setInterpolator(timeInterpolator);
    }

    public C3208p x(int i4) {
        if (i4 == 0) {
            this.f40969c = true;
            return this;
        }
        if (i4 == 1) {
            this.f40969c = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i4);
    }

    @Override // k0.AbstractC3204l
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C3208p setStartDelay(long j4) {
        return (C3208p) super.setStartDelay(j4);
    }

    @Override // k0.AbstractC3204l
    public AbstractC3204l clone() {
        C3208p c3208p = (C3208p) super.clone();
        c3208p.f40968b = new ArrayList();
        int size = this.f40968b.size();
        for (int i4 = 0; i4 < size; i4++) {
            c3208p.q(((AbstractC3204l) this.f40968b.get(i4)).clone());
        }
        return c3208p;
    }
}
