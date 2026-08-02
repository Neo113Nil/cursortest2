package defpackage;

import android.accounts.AccountManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gcy implements jrw {
    private final jsb a;

    public gcy(jsb jsbVar) {
        this.a = jsbVar;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AccountManager b() {
        AccountManager accountManager = (AccountManager) ((jrk) this.a).b().getSystemService("account");
        accountManager.getClass();
        return accountManager;
    }
}
