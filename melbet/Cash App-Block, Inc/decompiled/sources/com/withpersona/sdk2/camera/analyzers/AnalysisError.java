package com.withpersona.sdk2.camera.analyzers;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/camera/analyzers/AnalysisError;", "Ljava/lang/RuntimeException;", "NoAnalyzerError", "DetectorError", "GooglePlayError", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisError$DetectorError;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisError$GooglePlayError;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisError$NoAnalyzerError;", "camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AnalysisError extends RuntimeException {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/camera/analyzers/AnalysisError$DetectorError;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisError;", "camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DetectorError extends AnalysisError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/camera/analyzers/AnalysisError$GooglePlayError;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisError;", "camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GooglePlayError extends AnalysisError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/camera/analyzers/AnalysisError$NoAnalyzerError;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisError;", "camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoAnalyzerError extends AnalysisError {
    }
}
