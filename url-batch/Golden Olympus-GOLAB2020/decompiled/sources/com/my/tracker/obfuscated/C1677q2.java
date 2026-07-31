package com.my.tracker.obfuscated;

import android.content.Context;
import com.my.tracker.obfuscated.C1653k2;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.my.tracker.obfuscated.q2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1677q2 implements InterfaceC1673p2 {

    /* renamed from: a, reason: collision with root package name */
    final int f21505a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC1619c2 f21506b;

    /* renamed from: c, reason: collision with root package name */
    C1653k2 f21507c = null;

    /* renamed from: d, reason: collision with root package name */
    int f21508d = Integer.MIN_VALUE;

    private C1677q2(int i4, InterfaceC1619c2 interfaceC1619c2) {
        this.f21505a = i4;
        this.f21506b = interfaceC1619c2;
        AbstractC1708y2.a("TimeSpentRepository: repository created but not initialized. Will initialized when first timespent tick will arrive");
    }

    private boolean c() {
        return this.f21507c != null && this.f21508d >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C1653k2 d() {
        return null;
    }

    @Override // com.my.tracker.obfuscated.InterfaceC1673p2
    public synchronized void a(long[] jArr) {
        try {
            C1653k2 c1653k2 = this.f21507c;
            Objects.requireNonNull(c1653k2);
            c1653k2.a(jArr);
        } catch (Exception unused) {
            String str = "TimeSpentRepository: something went wrong while deleting " + jArr.length + " packets from db";
            AbstractC1708y2.b(str);
            throw new Exception(str);
        }
    }

    public void b() {
        if (c()) {
            return;
        }
        AbstractC1708y2.a("TimeSpentRepository: initializing repository...");
        try {
            C1653k2 c1653k2 = (C1653k2) this.f21506b.a();
            this.f21507c = c1653k2;
            this.f21508d = c1653k2.a();
            this.f21506b = new InterfaceC1619c2() { // from class: com.my.tracker.obfuscated.w3
                @Override // com.my.tracker.obfuscated.InterfaceC1619c2
                public final Object a() {
                    C1653k2 d4;
                    d4 = C1677q2.d();
                    return d4;
                }
            };
            AbstractC1708y2.a("TimeSpentRepository: successfully initialized, current size = " + this.f21508d + ", max size = " + this.f21505a);
        } catch (Exception e4) {
            AbstractC1708y2.b("TimeSpentRepository: error occured while initialization repository, repository not initialized", e4);
            this.f21507c = null;
            this.f21508d = Integer.MIN_VALUE;
            throw e4;
        }
    }

    private void a() {
        int i4 = (this.f21508d - this.f21505a) + 1;
        try {
            C1653k2 c1653k2 = this.f21507c;
            Objects.requireNonNull(c1653k2);
            int a4 = c1653k2.a(i4);
            this.f21508d -= a4;
            AbstractC1708y2.a("TimeSpentRepository: successfully deleted " + a4 + "(requested = " + i4 + ") oldest tick packets from db, currentDbSize = " + this.f21508d + " (reason: need free up space for new packet)");
        } catch (Exception e4) {
            AbstractC1708y2.b("TimeSpentRepository: something went wrong while trying to delete oldest" + i4 + " tick packets from db (reason: need free up space for new packet, maxSize = " + this.f21505a + ", current size = " + this.f21508d + "), can't store new tick packet", e4);
            throw new Exception(e4);
        }
    }

    @Override // com.my.tracker.obfuscated.InterfaceC1673p2
    public synchronized C1688t2[] a(int i4) {
        C1688t2[] c1688t2Arr;
        try {
            C1653k2 c1653k2 = this.f21507c;
            Objects.requireNonNull(c1653k2);
            C1653k2.b b4 = c1653k2.b(i4);
            try {
                ArrayList arrayList = new ArrayList(i4);
                while (b4.b()) {
                    arrayList.add(new C1688t2(b4.n(), b4.m()));
                }
                AbstractC1708y2.a("TimeSpentRepository: read " + arrayList.size() + " freshest packets from db");
                c1688t2Arr = arrayList.isEmpty() ? null : (C1688t2[]) arrayList.toArray(new C1688t2[0]);
                b4.close();
            } finally {
            }
        } catch (Throwable th) {
            AbstractC1708y2.b("TimeSpentRepository: error while reading " + i4 + " freshest tick packets", th);
            return null;
        }
        return c1688t2Arr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C1653k2 a(String str, Context context) {
        try {
            return C1653k2.a(str, context);
        } catch (Exception e4) {
            AbstractC1708y2.b("TimeSpentRepository: can't initialize sql database", e4);
            throw new RuntimeException(e4);
        }
    }

    public static C1677q2 a(int i4, C1712z2 c1712z2, final Context context) {
        final String g4 = c1712z2.g();
        return new C1677q2(i4, new InterfaceC1619c2() { // from class: com.my.tracker.obfuscated.v3
            @Override // com.my.tracker.obfuscated.InterfaceC1619c2
            public final Object a() {
                C1653k2 a4;
                a4 = C1677q2.a(g4, context);
                return a4;
            }
        });
    }

    @Override // com.my.tracker.obfuscated.InterfaceC1673p2
    public synchronized void a(long j4, byte[] bArr) {
        try {
            if (!c()) {
                b();
            }
            if (this.f21508d >= this.f21505a) {
                try {
                    a();
                } catch (Exception e4) {
                    AbstractC1708y2.b("TimeSpentRepository: free up database failed, can't put new TimeSpentTick (reason: db still full)");
                    throw new Exception(e4);
                }
            }
            try {
                long a4 = this.f21507c.a(j4, bArr);
                this.f21508d++;
                AbstractC1708y2.a("TimeSpentRepository: successfully stored new tick packet to db, tickPacketId = " + a4 + " (current db size = " + this.f21508d + ")");
            } catch (Exception e5) {
                AbstractC1708y2.b("TimeSpentRepository: something went wrong while saving new tick packet in database, this tick wouldn't be stored");
                throw new Exception(e5);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
