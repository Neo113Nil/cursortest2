package defpackage;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class auh extends kra implements krx {
    /* synthetic */ boolean a;
    final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auh(Context context, kqj kqjVar) {
        super(2, kqjVar);
        this.b = context;
    }

    @Override // defpackage.krx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((auh) c(bool, (kqj) obj2)).b(kow.a);
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        ixc.Y(obj);
        aym.a(this.b, RescheduleReceiver.class, this.a);
        return kow.a;
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        auh auhVar = new auh(this.b, kqjVar);
        auhVar.a = ((Boolean) obj).booleanValue();
        return auhVar;
    }
}
