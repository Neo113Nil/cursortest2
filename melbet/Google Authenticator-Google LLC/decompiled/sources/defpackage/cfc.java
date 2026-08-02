package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cfc {
    public cfj a = null;
    public final List b = new ArrayList();
    public cfe c = null;
    public String d = "";

    public final cfd a() {
        return new cfd(this.a, DesugarCollections.unmodifiableList(this.b), this.c, this.d);
    }
}
