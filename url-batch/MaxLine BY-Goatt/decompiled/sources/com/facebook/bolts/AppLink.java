package com.facebook.bolts;

import android.net.Uri;
import defpackage.ah0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AppLink {
    private final Uri sourceUrl;
    private final List<Target> targets;
    private final Uri webUrl;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Target {
        private final String appName;
        private final String className;
        private final String packageName;
        private final Uri url;

        public Target(String str, String str2, Uri uri, String str3) {
            str.getClass();
            str2.getClass();
            uri.getClass();
            str3.getClass();
            this.packageName = str;
            this.className = str2;
            this.url = uri;
            this.appName = str3;
        }

        public final String getAppName() {
            return this.appName;
        }

        public final String getClassName() {
            return this.className;
        }

        public final String getPackageName() {
            return this.packageName;
        }

        public final Uri getUrl() {
            return this.url;
        }
    }

    public AppLink(Uri uri, List<Target> list, Uri uri2) {
        uri.getClass();
        uri2.getClass();
        this.sourceUrl = uri;
        this.webUrl = uri2;
        this.targets = list == null ? ah0.m : list;
    }

    public final Uri getSourceUrl() {
        return this.sourceUrl;
    }

    public final List<Target> getTargets() {
        List<Target> unmodifiableList = Collections.unmodifiableList(this.targets);
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public final Uri getWebUrl() {
        return this.webUrl;
    }
}
