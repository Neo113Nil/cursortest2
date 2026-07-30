package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;
import defpackage.dy;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class LibraryVersionComponent {

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface VersionExtractor<T> {
        String extract(T t);
    }

    private LibraryVersionComponent() {
    }

    public static Component<?> create(String str, String str2) {
        return Component.intoSet(LibraryVersion.create(str, str2), (Class<LibraryVersion>) LibraryVersion.class);
    }

    public static Component<?> fromContext(String str, VersionExtractor<Context> versionExtractor) {
        return Component.intoSetBuilder(LibraryVersion.class).add(Dependency.required((Class<?>) Context.class)).factory(new dy(str, versionExtractor, 1)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ LibraryVersion lambda$fromContext$0(String str, VersionExtractor versionExtractor, ComponentContainer componentContainer) {
        return LibraryVersion.create(str, versionExtractor.extract((Context) componentContainer.get(Context.class)));
    }
}
