package org.jacoco.core.runtime;

/* loaded from: classes.dex */
public interface IRuntime extends IExecutionDataAccessorGenerator {
    void shutdown();

    void startup(RuntimeData runtimeData) throws Exception;
}
