package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvk extends kqe implements kxu {
    public static final ale b = new ale();
    public final long a;

    public kvk(long j) {
        super(b);
        this.a = j;
    }

    @Override // defpackage.kxu
    public final /* bridge */ /* synthetic */ Object a(kqn kqnVar) {
        kvl kvlVar = (kvl) kqnVar.get(kvl.b);
        String str = kvlVar != null ? kvlVar.a : "coroutine";
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int h = ksp.h(name);
        name.getClass();
        int lastIndexOf = name.lastIndexOf(" @", h);
        if (lastIndexOf < 0) {
            lastIndexOf = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + lastIndexOf + 10);
        String substring = name.substring(0, lastIndexOf);
        substring.getClass();
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.a);
        currentThread.setName(sb.toString());
        return name;
    }

    @Override // defpackage.kxu
    public final /* bridge */ /* synthetic */ void b(kqn kqnVar, Object obj) {
        Thread.currentThread().setName((String) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kvk) && this.a == ((kvk) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "CoroutineId(" + this.a + ")";
    }
}
