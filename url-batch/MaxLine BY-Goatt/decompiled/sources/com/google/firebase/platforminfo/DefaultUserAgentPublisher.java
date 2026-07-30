package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;
import defpackage.g90;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class DefaultUserAgentPublisher implements UserAgentPublisher {
    private final GlobalLibraryVersionRegistrar gamesSDKRegistrar;
    private final String javaSDKVersionUserAgent;

    public DefaultUserAgentPublisher(Set<LibraryVersion> set, GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar) {
        this.javaSDKVersionUserAgent = toUserAgent(set);
        this.gamesSDKRegistrar = globalLibraryVersionRegistrar;
    }

    public static Component<UserAgentPublisher> component() {
        return Component.builder(UserAgentPublisher.class).add(Dependency.setOf((Class<?>) LibraryVersion.class)).factory(new g90(0)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ UserAgentPublisher lambda$component$0(ComponentContainer componentContainer) {
        return new DefaultUserAgentPublisher(componentContainer.setOf(LibraryVersion.class), GlobalLibraryVersionRegistrar.getInstance());
    }

    private static String toUserAgent(Set<LibraryVersion> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<LibraryVersion> it = set.iterator();
        while (it.hasNext()) {
            LibraryVersion next = it.next();
            sb.append(next.getLibraryName());
            sb.append('/');
            sb.append(next.getVersion());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // com.google.firebase.platforminfo.UserAgentPublisher
    public String getUserAgent() {
        boolean isEmpty = this.gamesSDKRegistrar.getRegisteredVersions().isEmpty();
        String str = this.javaSDKVersionUserAgent;
        if (isEmpty) {
            return str;
        }
        return str + ' ' + toUserAgent(this.gamesSDKRegistrar.getRegisteredVersions());
    }
}
