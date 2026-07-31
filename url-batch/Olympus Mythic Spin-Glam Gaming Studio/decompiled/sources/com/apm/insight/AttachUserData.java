package com.apm.insight;

import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes12.dex */
public interface AttachUserData {
    @Nullable
    Map<? extends String, ? extends String> getUserData(CrashType crashType);
}
