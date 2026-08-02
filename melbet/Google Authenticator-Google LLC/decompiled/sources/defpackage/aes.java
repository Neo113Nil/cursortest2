package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aes implements krt {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aes(String str, int i) {
        this.c = i;
        this.b = "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?";
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kwu] */
    /* JADX WARN: Type inference failed for: r3v3, types: [aer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [aer, java.lang.Object] */
    @Override // defpackage.krt
    public final Object a(Object obj) {
        amh a;
        Long l = null;
        switch (this.c) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                aeq aeqVar = (aeq) entry.getKey();
                gdy gdyVar = (gdy) entry.getValue();
                while (true) {
                    Object obj2 = this.b;
                    ael aelVar = (ael) obj2;
                    if (((aek) gdyVar.c).compareTo(aelVar.c) < 0 && !aelVar.a && aelVar.d.m(aeqVar)) {
                        aelVar.b.add(gdyVar.c);
                        aei aeiVar = aej.Companion;
                        aej b = aei.b((aek) gdyVar.c);
                        if (b == null) {
                            Object obj3 = gdyVar.c;
                            Objects.toString(obj3);
                            throw new IllegalStateException("no event up from ".concat(String.valueOf(obj3)));
                        }
                        gdyVar.d(this.a, b);
                        ixc.z(aelVar.b);
                    }
                }
                return kow.a;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                aeq aeqVar2 = (aeq) entry2.getKey();
                gdy gdyVar2 = (gdy) entry2.getValue();
                while (true) {
                    Object obj4 = this.b;
                    ael aelVar2 = (ael) obj4;
                    if (((aek) gdyVar2.c).compareTo(aelVar2.c) > 0 && !aelVar2.a && aelVar2.d.m(aeqVar2)) {
                        aei aeiVar2 = aej.Companion;
                        aej a2 = aei.a((aek) gdyVar2.c);
                        if (a2 == null) {
                            Object obj5 = gdyVar2.c;
                            Objects.toString(obj5);
                            throw new IllegalStateException("no event down from ".concat(String.valueOf(obj5)));
                        }
                        ?? r3 = this.a;
                        aelVar2.b.add(a2.a());
                        gdyVar2.d(r3, a2);
                        ixc.z(aelVar2.b);
                    }
                }
                return kow.a;
            case 2:
                this.b.s(null);
                ((kyt) this.a).j((zy) obj);
                return kow.a;
            case 3:
                Object obj6 = this.a;
                return brr.c((String) this.b, (String) obj6, (ana) obj);
            case 4:
                ana anaVar = (ana) obj;
                anaVar.getClass();
                ((awz) this.a).a.c(anaVar, this.b);
                return kow.a;
            case 5:
                Object obj7 = this.a;
                return Boolean.valueOf(brr.g((String) this.b, (String) obj7, (ana) obj));
            case 6:
                ana anaVar2 = (ana) obj;
                anaVar2.getClass();
                ((axd) this.a).a.c(anaVar2, this.b);
                return kow.a;
            case 7:
                ana anaVar3 = (ana) obj;
                anaVar3.getClass();
                a = anaVar3.a((String) this.b);
                try {
                    a.i(1, (String) this.a);
                    if (a.l() && !a.k(0)) {
                        l = Long.valueOf(a.b(0));
                    }
                    return l;
                } finally {
                }
            case 8:
                qi qiVar = (qi) obj;
                qiVar.getClass();
                ((axg) this.a).b((ana) this.b, qiVar);
                return kow.a;
            case 9:
                qi qiVar2 = (qi) obj;
                qiVar2.getClass();
                ((axg) this.a).c((ana) this.b, qiVar2);
                return kow.a;
            case 10:
                ana anaVar4 = (ana) obj;
                anaVar4.getClass();
                ((axk) this.a).b.c(anaVar4, this.b);
                return kow.a;
            case 11:
                Object obj8 = this.a;
                return brr.d((String) this.b, (String) obj8, (ana) obj);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj9 = this.a;
                return brr.c((String) this.b, (String) obj9, (ana) obj);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ana anaVar5 = (ana) obj;
                anaVar5.getClass();
                ((axo) this.a).a.c(anaVar5, this.b);
                return kow.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj10 = this.a;
                return brr.d((String) this.b, (String) obj10, (ana) obj);
            case 15:
                Object obj11 = this.a;
                return brr.d((String) this.b, (String) obj11, (ana) obj);
            case 16:
                ana anaVar6 = (ana) obj;
                anaVar6.getClass();
                a = anaVar6.a((String) this.b);
                try {
                    a.i(1, (String) this.a);
                    ArrayList arrayList = new ArrayList();
                    while (a.l()) {
                        arrayList.add(new axr(a.d(0), abf.l((int) a.b(1))));
                    }
                    return arrayList;
                } finally {
                }
            case 17:
                Object obj12 = this.a;
                return brr.c((String) this.b, (String) obj12, (ana) obj);
            case 18:
                Object obj13 = this.a;
                return Integer.valueOf(brr.e((String) this.b, (String) obj13, (ana) obj));
            case 19:
                Object obj14 = this.a;
                return brr.d((String) this.b, (String) obj14, (ana) obj);
            default:
                ana anaVar7 = (ana) obj;
                anaVar7.getClass();
                a = anaVar7.a((String) this.b);
                try {
                    a.i(1, (String) this.a);
                    ArrayList arrayList2 = new ArrayList();
                    while (a.l()) {
                        byte[] m = a.m(0);
                        asa asaVar = asa.a;
                        arrayList2.add(yn.h(m));
                    }
                    return arrayList2;
                } finally {
                }
        }
    }

    public /* synthetic */ aes(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ aes(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ aes(String str, int i, byte[] bArr) {
        this.c = i;
        this.b = "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)";
        this.a = str;
    }

    public /* synthetic */ aes(String str, int i, char[] cArr) {
        this.c = i;
        this.b = "SELECT long_value FROM Preference where `key`=?";
        this.a = str;
    }

    public /* synthetic */ aes(String str, int i, float[] fArr) {
        this.c = i;
        this.b = "DELETE FROM workspec WHERE id=?";
        this.a = str;
    }

    public /* synthetic */ aes(String str, int i, int[] iArr) {
        this.c = i;
        this.b = "SELECT name FROM workname WHERE work_spec_id=?";
        this.a = str;
    }

    public /* synthetic */ aes(String str, int i, short[] sArr) {
        this.c = i;
        this.b = "DELETE FROM SystemIdInfo where work_spec_id=?";
        this.a = str;
    }

    public /* synthetic */ aes(String str, int i, boolean[] zArr) {
        this.c = i;
        this.b = "DELETE from WorkProgress where work_spec_id=?";
        this.a = str;
    }

    public /* synthetic */ aes(String str, int i, byte[][] bArr) {
        this.c = i;
        this.b = "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        this.a = str;
    }

    public /* synthetic */ aes(String str, int i, char[][] cArr) {
        this.c = i;
        this.b = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        this.a = str;
    }

    public /* synthetic */ aes(String str, int i, int[][] iArr) {
        this.c = i;
        this.b = "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        this.a = str;
    }

    public /* synthetic */ aes(String str, int i, short[][] sArr) {
        this.c = i;
        this.b = "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        this.a = str;
    }

    public /* synthetic */ aes(String str, int i, boolean[][] zArr) {
        this.c = i;
        this.b = "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)";
        this.a = str;
    }
}
