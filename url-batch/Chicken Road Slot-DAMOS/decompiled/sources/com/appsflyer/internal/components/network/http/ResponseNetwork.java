package com.appsflyer.internal.components.network.http;

import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface ResponseNetwork<Body> {
    Body getBody();

    List<String> getHeaderField(String str);

    int getStatusCode();

    boolean isSuccessful();
}
