package b;

import android.content.Intent;
import android.content.IntentSender;
import e.C0552c;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import u1.C1217a;
import w2.C1294c;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5547e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5548i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f5549j;

    public /* synthetic */ l(int i2, int i4, Object obj, Object obj2) {
        this.f5546d = i4;
        this.f5547e = obj;
        this.f5548i = i2;
        this.f5549j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5546d) {
            case 0:
                m this$0 = (m) this.f5547e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Serializable serializable = (Serializable) ((C1294c) this.f5549j).f11388d;
                String str = (String) this$0.f5550a.get(Integer.valueOf(this.f5548i));
                if (str != null) {
                    C0552c c0552c = (C0552c) this$0.f5554e.get(str);
                    if ((c0552c != null ? c0552c.f6142a : null) != null) {
                        B1.m mVar = c0552c.f6142a;
                        if (this$0.f5553d.remove(str)) {
                            mVar.a(serializable);
                            break;
                        }
                    } else {
                        this$0.f5556g.remove(str);
                        this$0.f5555f.put(str, serializable);
                        break;
                    }
                }
                break;
            case 1:
                m this$02 = (m) this.f5547e;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                IntentSender.SendIntentException e4 = (IntentSender.SendIntentException) this.f5549j;
                Intrinsics.checkNotNullParameter(e4, "$e");
                this$02.a(this.f5548i, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e4));
                break;
            default:
                ((C1217a) this.f5547e).f10893b.e(this.f5548i, (Serializable) this.f5549j);
                break;
        }
    }
}
