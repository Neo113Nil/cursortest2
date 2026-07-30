package n;

import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class F0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ I0 f6636e;

    public /* synthetic */ F0(I0 i02, int i2) {
        this.f6635d = i2;
        this.f6636e = i02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f6635d;
        I0 i02 = this.f6636e;
        switch (i2) {
            case 0:
                C0742w0 c0742w0 = i02.f6652i;
                if (c0742w0 != null) {
                    c0742w0.setListSelectionHidden(true);
                    c0742w0.requestLayout();
                    break;
                }
                break;
            default:
                C0742w0 c0742w02 = i02.f6652i;
                if (c0742w02 != null) {
                    WeakHashMap weakHashMap = I.T.f1153a;
                    if (c0742w02.isAttachedToWindow() && i02.f6652i.getCount() > i02.f6652i.getChildCount() && i02.f6652i.getChildCount() <= i02.f6662u) {
                        i02.f6649G.setInputMethodMode(2);
                        i02.c();
                        break;
                    }
                }
                break;
        }
    }
}
