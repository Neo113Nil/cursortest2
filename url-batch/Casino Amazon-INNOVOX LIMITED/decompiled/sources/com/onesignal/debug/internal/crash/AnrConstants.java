package com.onesignal.debug.internal.crash;

import com.onesignal.core.BuildConfig;
import kotlin.Metadata;

/* compiled from: AnrConstants.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/onesignal/debug/internal/crash/AnrConstants;", "", "()V", "DEFAULT_ANR_THRESHOLD_MS", "", "DEFAULT_BACKGROUND_BLOCK_THRESHOLD_MS", "DEFAULT_CHECK_INTERVAL_MS", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnrConstants {
    public static final long DEFAULT_ANR_THRESHOLD_MS = 5000;
    public static final long DEFAULT_BACKGROUND_BLOCK_THRESHOLD_MS = 10000;
    public static final long DEFAULT_CHECK_INTERVAL_MS = 2000;
    public static final AnrConstants INSTANCE = new AnrConstants();

    private AnrConstants() {
    }
}
