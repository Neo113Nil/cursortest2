package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.i;

/* loaded from: classes5.dex */
public class b extends d {
    private String name;

    public b(String str, org.bouncycastle.math.ec.e eVar, i iVar, BigInteger bigInteger) {
        super(eVar, iVar, bigInteger);
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    public b(String str, org.bouncycastle.math.ec.e eVar, i iVar, BigInteger bigInteger, BigInteger bigInteger2) {
        super(eVar, iVar, bigInteger, bigInteger2);
        this.name = str;
    }

    public b(String str, org.bouncycastle.math.ec.e eVar, i iVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        super(eVar, iVar, bigInteger, bigInteger2, bArr);
        this.name = str;
    }
}
