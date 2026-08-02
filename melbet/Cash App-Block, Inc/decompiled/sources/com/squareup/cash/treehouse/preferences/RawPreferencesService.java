package com.squareup.cash.treehouse.preferences;

import app.cash.zipline.ZiplineService;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public interface RawPreferencesService extends ZiplineService {
    String displayUnit();

    Flow displayUnitFlow();
}
