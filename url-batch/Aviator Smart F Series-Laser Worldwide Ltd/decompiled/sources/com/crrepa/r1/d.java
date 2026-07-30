package com.crrepa.r1;

import com.crrepa.l1.p;
import com.crrepa.o1.d;
import java.sql.Date;
import java.sql.Timestamp;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f13755a;

    /* renamed from: b, reason: collision with root package name */
    public static final d.b f13756b;

    /* renamed from: c, reason: collision with root package name */
    public static final d.b f13757c;

    /* renamed from: d, reason: collision with root package name */
    public static final p f13758d;

    /* renamed from: e, reason: collision with root package name */
    public static final p f13759e;

    /* renamed from: f, reason: collision with root package name */
    public static final p f13760f;

    class a extends d.b {
        a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.crrepa.o1.d.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Date a(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    class b extends d.b {
        b(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.crrepa.o1.d.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Timestamp a(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z7;
        p pVar;
        try {
            Class.forName("java.sql.Date");
            z7 = true;
        } catch (ClassNotFoundException unused) {
            z7 = false;
        }
        f13755a = z7;
        if (z7) {
            f13756b = new a(Date.class);
            f13757c = new b(Timestamp.class);
            f13758d = com.crrepa.r1.a.f13749b;
            f13759e = com.crrepa.r1.b.f13751b;
            pVar = c.f13753b;
        } else {
            pVar = null;
            f13756b = null;
            f13757c = null;
            f13758d = null;
            f13759e = null;
        }
        f13760f = pVar;
    }

    private d() {
    }
}
