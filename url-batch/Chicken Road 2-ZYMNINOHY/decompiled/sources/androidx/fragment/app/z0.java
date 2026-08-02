package androidx.fragment.app;

import E.AbstractC0005f;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5000a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0211o f5001b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B0 f5002c;

    public /* synthetic */ z0(C0211o c0211o, B0 b02, int i4) {
        this.f5000a = i4;
        this.f5001b = c0211o;
        this.f5002c = b02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5000a) {
            case 0:
                C0211o c0211o = this.f5001b;
                ArrayList arrayList = c0211o.f4936b;
                B0 b02 = this.f5002c;
                if (arrayList.contains(b02)) {
                    int i4 = b02.f4723a;
                    View view = b02.f4725c.mView;
                    kotlin.jvm.internal.i.d(view, "operation.fragment.mView");
                    AbstractC0005f.a(i4, view, c0211o.f4935a);
                    break;
                }
                break;
            case 1:
                C0211o this$0 = this.f5001b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                B0 operation = this.f5002c;
                kotlin.jvm.internal.i.e(operation, "$operation");
                this$0.a(operation);
                break;
            default:
                C0211o c0211o2 = this.f5001b;
                ArrayList arrayList2 = c0211o2.f4936b;
                B0 b03 = this.f5002c;
                arrayList2.remove(b03);
                c0211o2.f4937c.remove(b03);
                break;
        }
    }
}
