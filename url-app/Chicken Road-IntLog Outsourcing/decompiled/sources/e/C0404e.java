package e;

import f.AbstractC0413a;
import java.util.HashMap;

/* renamed from: e.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0404e extends AbstractC0402c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0413a f5501b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0407h f5502c;

    public C0404e(AbstractC0407h abstractC0407h, String str, AbstractC0413a abstractC0413a) {
        this.f5502c = abstractC0407h;
        this.f5500a = str;
        this.f5501b = abstractC0413a;
    }

    @Override // e.AbstractC0402c
    public final void a(C0408i c0408i) {
        AbstractC0407h abstractC0407h = this.f5502c;
        HashMap hashMap = abstractC0407h.f5508b;
        String str = this.f5500a;
        Integer num = (Integer) hashMap.get(str);
        AbstractC0413a abstractC0413a = this.f5501b;
        if (num != null) {
            abstractC0407h.f5510d.add(str);
            try {
                abstractC0407h.b(num.intValue(), abstractC0413a, c0408i);
                return;
            } catch (Exception e3) {
                abstractC0407h.f5510d.remove(str);
                throw e3;
            }
        }
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC0413a + " and input " + c0408i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }
}
