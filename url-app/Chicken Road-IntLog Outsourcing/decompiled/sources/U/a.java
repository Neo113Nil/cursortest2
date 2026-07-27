package U;

import com.yandex.varioqub.config.impl.B;
import java.io.Serializable;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3032b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3033c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3034d;

    public /* synthetic */ a(int i2, int i3, Object obj, Object obj2) {
        this.f3031a = i3;
        this.f3033c = obj;
        this.f3032b = i2;
        this.f3034d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3031a) {
            case 0:
                ((f) ((b) this.f3033c).f3037c).c(this.f3032b, (Serializable) this.f3034d);
                break;
            default:
                B.a((B) this.f3033c, this.f3032b, (InterfaceC1430a) this.f3034d);
                break;
        }
    }
}
