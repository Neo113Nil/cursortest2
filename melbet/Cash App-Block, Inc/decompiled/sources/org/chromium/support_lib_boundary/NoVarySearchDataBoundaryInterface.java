package org.chromium.support_lib_boundary;

import java.util.List;

/* loaded from: classes10.dex */
public interface NoVarySearchDataBoundaryInterface {
    List<String> getConsideredQueryParameters();

    boolean getIgnoreDifferencesInParameters();

    List<String> getIgnoredQueryParameters();

    boolean getVaryOnKeyOrder();
}
