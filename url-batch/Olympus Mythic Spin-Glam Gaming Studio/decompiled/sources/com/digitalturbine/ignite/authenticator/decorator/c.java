package com.digitalturbine.ignite.authenticator.decorator;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class c implements Runnable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ e b;

    public c(e eVar, d dVar) {
        this.b = eVar;
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.digitalturbine.ignite.authenticator.entities.a a;
        e eVar = this.b;
        if (eVar.a()) {
            try {
                a = com.digitalturbine.ignite.authenticator.parsers.a.a(new JSONObject(eVar.j.version()));
            } catch (Exception e) {
                com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_GENERAL_ERROR, e);
                com.digitalturbine.ignite.authenticator.logger.a.b("%s: resolveIgniteServiceVersion : unable to resolve version : %s", "IgniteAuthenticationComponent", e.toString());
            }
            eVar.i = a;
            com.digitalturbine.ignite.authenticator.utils.concurency.c.b.post(this.a);
        }
        a = new com.digitalturbine.ignite.authenticator.entities.a(false, "");
        eVar.i = a;
        com.digitalturbine.ignite.authenticator.utils.concurency.c.b.post(this.a);
    }
}
