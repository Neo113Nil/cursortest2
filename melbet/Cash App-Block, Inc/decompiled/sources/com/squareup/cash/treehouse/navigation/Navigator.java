package com.squareup.cash.treehouse.navigation;

import app.cash.zipline.ZiplineService;
import com.squareup.cash.treehouse.flows.FlowSpec;
import kotlin.coroutines.Continuation;

/* loaded from: classes7.dex */
public interface Navigator extends ZiplineService {
    void navigateBack();

    Object navigateBackSuspending(Continuation continuation);

    Object navigateToUrl(String str, TreehouseRoutingParams treehouseRoutingParams, Continuation continuation);

    Object startFlow(FlowSpec flowSpec, Continuation continuation);
}
