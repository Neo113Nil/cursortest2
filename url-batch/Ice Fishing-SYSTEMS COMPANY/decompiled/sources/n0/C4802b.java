package n0;

import E7.p;
import O7.InterfaceC0397w;
import android.net.Uri;
import android.view.InputEvent;
import com.bumptech.glide.f;
import p0.C4854c;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.h;

/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4802b extends h implements p {

    /* renamed from: n, reason: collision with root package name */
    public int f39621n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4804d f39622u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Uri f39623v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InputEvent f39624w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4802b(C4804d c4804d, Uri uri, InputEvent inputEvent, InterfaceC5133d interfaceC5133d) {
        super(2, interfaceC5133d);
        this.f39622u = c4804d;
        this.f39623v = uri;
        this.f39624w = inputEvent;
    }

    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
        return new C4802b(this.f39622u, this.f39623v, this.f39624w, interfaceC5133d);
    }

    @Override // E7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4802b) create((InterfaceC0397w) obj, (InterfaceC5133d) obj2)).invokeSuspend(v.f40183a);
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        int i = this.f39621n;
        if (i == 0) {
            f.r(obj);
            C4854c c4854c = this.f39622u.f39628a;
            this.f39621n = 1;
            if (c4854c.c(this.f39623v, this.f39624w, this) == enumC5179a) {
                return enumC5179a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.r(obj);
        }
        return v.f40183a;
    }
}
