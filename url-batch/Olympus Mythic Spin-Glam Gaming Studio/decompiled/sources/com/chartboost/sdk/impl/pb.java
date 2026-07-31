package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class pb {
    public final String a;
    public final List b;
    public final mk c;
    public final List d;
    public final List e;

    public pb(String str, List trackingEvents, mk mkVar, List mediaFiles, List icons) {
        Intrinsics.checkNotNullParameter(trackingEvents, "trackingEvents");
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(icons, "icons");
        this.a = str;
        this.b = trackingEvents;
        this.c = mkVar;
        this.d = mediaFiles;
        this.e = icons;
    }

    public final pb a(String str, List trackingEvents, mk mkVar, List mediaFiles, List icons) {
        Intrinsics.checkNotNullParameter(trackingEvents, "trackingEvents");
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(icons, "icons");
        return new pb(str, trackingEvents, mkVar, mediaFiles, icons);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb)) {
            return false;
        }
        pb pbVar = (pb) obj;
        return Intrinsics.areEqual(this.a, pbVar.a) && Intrinsics.areEqual(this.b, pbVar.b) && Intrinsics.areEqual(this.c, pbVar.c) && Intrinsics.areEqual(this.d, pbVar.d) && Intrinsics.areEqual(this.e, pbVar.e);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31;
        mk mkVar = this.c;
        return ((((hashCode + (mkVar != null ? mkVar.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "Linear(duration=" + this.a + ", trackingEvents=" + this.b + ", videoClicks=" + this.c + ", mediaFiles=" + this.d + ", icons=" + this.e + ")";
    }

    public static /* synthetic */ pb a(pb pbVar, String str, List list, mk mkVar, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pbVar.a;
        }
        if ((i & 2) != 0) {
            list = pbVar.b;
        }
        List list4 = list;
        if ((i & 4) != 0) {
            mkVar = pbVar.c;
        }
        mk mkVar2 = mkVar;
        if ((i & 8) != 0) {
            list2 = pbVar.d;
        }
        List list5 = list2;
        if ((i & 16) != 0) {
            list3 = pbVar.e;
        }
        return pbVar.a(str, list4, mkVar2, list5, list3);
    }

    public final List b() {
        return this.b;
    }

    public final mk c() {
        return this.c;
    }

    public final List a() {
        return this.d;
    }
}
