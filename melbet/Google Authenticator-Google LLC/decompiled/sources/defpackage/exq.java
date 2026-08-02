package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class exq extends ez {
    @Override // defpackage.ez
    public final /* bridge */ /* synthetic */ boolean a(Object obj, Object obj2) {
        exn exnVar = (exn) obj;
        exn exnVar2 = (exn) obj2;
        return exnVar.a.equals(exnVar2.a) && exnVar.b == exnVar2.b && exnVar.c == exnVar2.c;
    }

    @Override // defpackage.ez
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        return ((exn) obj).a.equals(((exn) obj2).a);
    }
}
