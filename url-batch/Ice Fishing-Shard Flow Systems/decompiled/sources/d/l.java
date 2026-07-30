package d;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import c1.C0290c;
import e0.C0370a;
import f.C0386e;
import f.InterfaceC0383b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4584e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4585i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4586l;

    public /* synthetic */ l(int i2, int i5, Object obj, Object obj2) {
        this.f4583d = i5;
        this.f4584e = obj;
        this.f4585i = i2;
        this.f4586l = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4583d) {
            case 0:
                m this$0 = (m) this.f4584e;
                C0290c c0290c = (C0290c) this.f4586l;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Object obj = c0290c.f4173d;
                String str = (String) this$0.f4751a.get(Integer.valueOf(this.f4585i));
                if (str != null) {
                    C0386e c0386e = (C0386e) this$0.f4755e.get(str);
                    if ((c0386e != null ? c0386e.f4743a : null) != null) {
                        InterfaceC0383b interfaceC0383b = c0386e.f4743a;
                        Intrinsics.c(interfaceC0383b, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                        if (this$0.f4754d.remove(str)) {
                            interfaceC0383b.c(obj);
                            break;
                        }
                    } else {
                        this$0.f4757g.remove(str);
                        this$0.f4756f.put(str, obj);
                        break;
                    }
                }
                break;
            case 1:
                m this$02 = (m) this.f4584e;
                IntentSender.SendIntentException e7 = (IntentSender.SendIntentException) this.f4586l;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(e7, "$e");
                this$02.a(this.f4585i, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e7));
                break;
            case 2:
                ((e0.d) ((C0370a) this.f4584e).f4668c).m(this.f4585i, this.f4586l);
                break;
            default:
                ((q.o) this.f4584e).onGreatestScrollPercentageIncreased(this.f4585i, (Bundle) this.f4586l);
                break;
        }
    }
}
