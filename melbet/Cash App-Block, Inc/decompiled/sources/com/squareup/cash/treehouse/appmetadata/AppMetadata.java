package com.squareup.cash.treehouse.appmetadata;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AppMetadata {
    public static final List all;
    public static final List staging;
    public final int localDevelopmentPort;
    public final String name;

    static {
        AppMetadata appMetadata = new AppMetadata("acorn", "Acorn", 22374);
        all = CollectionsKt__CollectionsKt.listOf((Object[]) new AppMetadata[]{new AppMetadata("activity", "Activity", 22364), new AppMetadata("bitcoin", 22372, 0, "Bitcoin"), new AppMetadata("cash-app-pay", 22371, 0, "Cash App Pay"), new AppMetadata("discover", "Discover", 22369), new AppMetadata("financial-services", 22370, 0, "Financial Services"), new AppMetadata("flows", 22365, 0, "Flows"), new AppMetadata("marketing", 22373, 0, "Marketing"), new AppMetadata("money", 22367, 0, "Money"), new AppMetadata("playground", "Playground", 22368)});
        staging = CollectionsKt__CollectionsJVMKt.listOf(appMetadata);
    }

    public AppMetadata(String str, int i, int i2, String str2) {
        this.name = str;
        this.localDevelopmentPort = i;
    }

    public final int getLocalDevelopmentPort() {
        return this.localDevelopmentPort;
    }

    public final String getName() {
        return this.name;
    }

    public AppMetadata(String str, String str2, int i) {
        this.name = str;
        this.localDevelopmentPort = i;
    }
}
