package org.jacoco.core.analysis;

/* loaded from: classes4.dex */
public interface ILine {
    ICounter getBranchCounter();

    ICounter getInstructionCounter();

    int getStatus();
}
