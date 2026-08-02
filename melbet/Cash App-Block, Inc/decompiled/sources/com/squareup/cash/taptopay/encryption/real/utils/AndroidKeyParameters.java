package com.squareup.cash.taptopay.encryption.real.utils;

import java.security.spec.MGF1ParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* loaded from: classes9.dex */
public abstract class AndroidKeyParameters {
    public static final OAEPParameterSpec TRANSPORT_WRAPPING_PARAMS = new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT);
}
