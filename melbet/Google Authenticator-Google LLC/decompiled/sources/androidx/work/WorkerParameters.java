package androidx.work;

import defpackage.asa;
import defpackage.ash;
import defpackage.atf;
import defpackage.kqn;
import defpackage.ldt;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WorkerParameters {
    public final UUID a;
    public final asa b;
    public final Set c;
    public final Executor d;
    public final kqn e;
    public final atf f;
    public final ash g;
    public final ldt h;

    public WorkerParameters(UUID uuid, asa asaVar, Collection collection, Executor executor, kqn kqnVar, ldt ldtVar, atf atfVar, ash ashVar) {
        this.a = uuid;
        this.b = asaVar;
        this.c = new HashSet(collection);
        this.d = executor;
        this.e = kqnVar;
        this.h = ldtVar;
        this.f = atfVar;
        this.g = ashVar;
    }
}
