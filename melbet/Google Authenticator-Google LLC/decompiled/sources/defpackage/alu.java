package defpackage;

import java.util.Comparator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class alu implements Comparator {
    private final /* synthetic */ int a;

    public alu(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ixe.j((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                qs qsVar = wb.a;
                int length = bArr.length;
                int length2 = bArr2.length;
                if (length != length2) {
                    return length - length2;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 2:
                return ixe.j((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 3:
                return ixe.j(((alv) obj).a, ((alv) obj2).a);
            case 4:
                return ixe.j(((alx) obj).a, ((alx) obj2).a);
            case 5:
                cli cliVar = (cli) obj;
                String str = cliVar.a;
                cli cliVar2 = (cli) obj2;
                String str2 = cliVar2.a;
                return !str.equals(str2) ? str.compareTo(str2) : Long.compare(cliVar.a(), cliVar2.a());
            case 6:
                return Long.compare(((ejz) ((bsh) obj).b).a, ((ejz) ((bsh) obj2).b).a);
            case 7:
                hoa a = hoa.a(obj);
                hoa a2 = hoa.a(obj2);
                if (a != a2) {
                    return a.compareTo(a2);
                }
                int ordinal = a.ordinal();
                if (ordinal == 0) {
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                if (ordinal == 1) {
                    return ((String) obj).compareTo((String) obj2);
                }
                if (ordinal == 2) {
                    return ((Long) obj).compareTo((Long) obj2);
                }
                if (ordinal == 3) {
                    return ((Double) obj).compareTo((Double) obj2);
                }
                throw null;
            default:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
        }
    }
}
