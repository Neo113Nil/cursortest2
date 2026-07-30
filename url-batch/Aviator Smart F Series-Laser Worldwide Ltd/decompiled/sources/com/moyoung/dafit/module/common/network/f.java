package com.moyoung.dafit.module.common.network;

import com.moyoung.dafit.module.common.R$string;
import java.nio.charset.StandardCharsets;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public class f {
    private static final int DES_KEY_END_INDEX = 88;
    private static final int DES_KEY_START_INDEX = 67;
    private static final String MCRYPT_TRIPLEDES = "DESede";
    public static final String TRANSFORMATION = "DESede/CBC/PKCS5Padding";

    private f() {
    }

    public static IvParameterSpec getIvParameter() {
        return new IvParameterSpec(com.moyoung.dafit.module.common.utils.d.get().getString(R$string.des_iv).getBytes(StandardCharsets.UTF_8));
    }

    public static SecretKey getSecretKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(com.moyoung.dafit.module.common.utils.d.get().getString(R$string.des_key));
        for (int i8 = 67; i8 <= 88; i8++) {
            sb.append((char) i8);
        }
        return new SecretKeySpec(sb.toString().getBytes(StandardCharsets.UTF_8), MCRYPT_TRIPLEDES);
    }
}
