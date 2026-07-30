package com.google.firebase.platforminfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class LibraryVersion {
    public static LibraryVersion create(String str, String str2) {
        return new AutoValue_LibraryVersion(str, str2);
    }

    public abstract String getLibraryName();

    public abstract String getVersion();
}
