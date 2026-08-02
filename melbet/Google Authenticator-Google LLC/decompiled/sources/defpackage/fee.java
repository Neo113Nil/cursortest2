package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fee implements koe {
    private static final List d;
    public volatile fed c;
    private final String e;
    public final Object b = new Object();
    public final Map a = new HashMap(10);

    static {
        new fee("");
        d = new ArrayList();
    }

    private fee(String str) {
        this.e = str;
    }

    public static long a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            return ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static synchronized fee d(String str) {
        synchronized (fee.class) {
            List<fee> list = d;
            for (fee feeVar : list) {
                if (feeVar.e.equals(str)) {
                    return feeVar;
                }
            }
            fee feeVar2 = new fee(str);
            list.add(feeVar2);
            return feeVar2;
        }
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        return this.c;
    }

    public final fdx c(String str, fdz... fdzVarArr) {
        synchronized (this.b) {
            Map map = this.a;
            fdx fdxVar = (fdx) map.get(str);
            if (fdxVar != null) {
                fdxVar.f(fdzVarArr);
                return fdxVar;
            }
            fdx fdxVar2 = new fdx(str, this, fdzVarArr);
            map.put(fdxVar2.b, fdxVar2);
            return fdxVar2;
        }
    }

    public final fea e(String str, fdz... fdzVarArr) {
        synchronized (this.b) {
            Map map = this.a;
            fea feaVar = (fea) map.get(str);
            if (feaVar != null) {
                feaVar.f(fdzVarArr);
                return feaVar;
            }
            fea feaVar2 = new fea(str, this, fdzVarArr);
            map.put(feaVar2.b, feaVar2);
            return feaVar2;
        }
    }
}
