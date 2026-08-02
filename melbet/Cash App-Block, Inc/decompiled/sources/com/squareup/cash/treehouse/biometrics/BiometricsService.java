package com.squareup.cash.treehouse.biometrics;

import app.cash.zipline.ZiplineService;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public interface BiometricsService extends ZiplineService {
    Object hasStoredValue(String str, Continuation continuation);

    boolean isUserEnrolled();

    boolean promptForEnrollment();

    Object write(String str, String str2, ContinuationImpl continuationImpl);
}
