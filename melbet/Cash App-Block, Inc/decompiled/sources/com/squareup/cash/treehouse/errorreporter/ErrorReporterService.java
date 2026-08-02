package com.squareup.cash.treehouse.errorreporter;

import app.cash.zipline.ZiplineService;

/* loaded from: classes7.dex */
public interface ErrorReporterService extends ZiplineService {
    void report(ErrorReport errorReport);
}
