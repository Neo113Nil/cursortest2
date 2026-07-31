package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class Jb {
    public static List a(Configuration configuration) {
        return AndroidUtils.isApiAchieved(24) ? Kb.a(configuration) : CollectionsKt.listOf(He.a(configuration.locale));
    }
}
