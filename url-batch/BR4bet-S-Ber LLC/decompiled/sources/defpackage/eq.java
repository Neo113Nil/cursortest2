package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class eq implements rn {
    public final mq f;
    public final /* synthetic */ jq g;

    public eq(jq jqVar, mq mqVar) {
        this.g = jqVar;
        this.f = mqVar;
    }

    @Override // defpackage.rn
    public final Object a() {
        jq jqVar = this.g;
        mq mqVar = this.f;
        try {
        } catch (IOException e) {
            jqVar.f(2, 2, e);
        } catch (Throwable th) {
            jqVar.f(3, 3, null);
            cb0.b(mqVar);
            throw th;
        }
        if (!mqVar.f(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        while (mqVar.f(false, this)) {
        }
        jqVar.f(1, 9, null);
        cb0.b(mqVar);
        return ej.q;
    }
}
