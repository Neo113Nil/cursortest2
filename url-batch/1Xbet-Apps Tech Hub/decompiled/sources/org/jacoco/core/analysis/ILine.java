package org.jacoco.core.analysis;

/* loaded from: classes.dex */
public interface ILine {
    ICounter getBranchCounter();

    ICounter getInstructionCounter();

    int getStatus();
}
