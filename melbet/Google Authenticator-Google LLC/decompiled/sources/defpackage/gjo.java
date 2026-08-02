package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gjo implements krx {
    private final /* synthetic */ int a;

    public /* synthetic */ gjo(int i) {
        this.a = i;
    }

    @Override // defpackage.krx
    public final Object a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                iwq iwqVar = gjw.m;
                ((bry) obj).getClass();
                return Boolean.valueOf(((Cursor) obj2).getCount() > 0);
            case 1:
                Cursor cursor = (Cursor) obj2;
                iwq iwqVar2 = gjw.m;
                ((bry) obj).getClass();
                kpt kptVar = new kpt(10);
                while (cursor.moveToNext()) {
                    String string = cursor.getString(cursor.getColumnIndexOrThrow("listener_key"));
                    string.getClass();
                    kptVar.add(string);
                }
                return ixc.a(kptVar);
            case 2:
                kaa kaaVar = (kaa) obj2;
                ((kbq) obj).getClass();
                kaaVar.getClass();
                return Boolean.valueOf(kaaVar.b(idg.b) != null);
            case 3:
                kbq kbqVar = (kbq) obj;
                kbqVar.getClass();
                ((kaa) obj2).getClass();
                return Boolean.valueOf(kbqVar.o == kbn.UNAVAILABLE);
            case 4:
                String str = (String) obj;
                kql kqlVar = (kql) obj2;
                str.getClass();
                kqlVar.getClass();
                if (str.length() == 0) {
                    return kqlVar.toString();
                }
                return str + ", " + kqlVar;
            case 5:
                kqn kqnVar = (kqn) obj;
                kql kqlVar2 = (kql) obj2;
                kqnVar.getClass();
                kqlVar2.getClass();
                kqn minusKey = kqnVar.minusKey(kqlVar2.getKey());
                kqo kqoVar = kqo.a;
                if (minusKey == kqoVar) {
                    return kqlVar2;
                }
                ale aleVar = kqk.b;
                kqk kqkVar = (kqk) minusKey.get(aleVar);
                if (kqkVar == null) {
                    return new kqi(minusKey, kqlVar2);
                }
                kqn minusKey2 = minusKey.minusKey(aleVar);
                return minusKey2 == kqoVar ? new kqi(kqlVar2, kqkVar) : new kqi(new kqi(minusKey2, kqlVar2), kqkVar);
            case 6:
                return Boolean.valueOf(((Boolean) obj).booleanValue() || (((kql) obj2) instanceof gwe));
            case 7:
                kqn kqnVar2 = (kqn) obj;
                kql kqlVar3 = (kql) obj2;
                return kqlVar3 instanceof gwe ? kqnVar2.plus(((gwe) kqlVar3).c()) : kqnVar2.plus(kqlVar3);
            case 8:
                return Boolean.valueOf(ksp.b(obj, obj2));
            case 9:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 10:
                kql kqlVar4 = (kql) obj2;
                if (!(kqlVar4 instanceof kxu)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? kqlVar4 : Integer.valueOf(intValue + 1);
            case 11:
                kxu kxuVar = (kxu) obj;
                kql kqlVar5 = (kql) obj2;
                if (kxuVar != null) {
                    return kxuVar;
                }
                if (kqlVar5 instanceof kxu) {
                    return (kxu) kqlVar5;
                }
                return null;
            default:
                ldi ldiVar = (ldi) obj;
                kql kqlVar6 = (kql) obj2;
                if (!(kqlVar6 instanceof kxu)) {
                    return ldiVar;
                }
                kxu kxuVar2 = (kxu) kqlVar6;
                Object a = kxuVar2.a(ldiVar.a);
                Object[] objArr = ldiVar.b;
                int i = ldiVar.d;
                objArr[i] = a;
                kxu[] kxuVarArr = ldiVar.c;
                ldiVar.d = i + 1;
                kxuVar2.getClass();
                kxuVarArr[i] = kxuVar2;
                return ldiVar;
        }
    }
}
