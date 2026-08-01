package org.jacoco.core.analysis;

import java.util.Collection;

/* loaded from: classes.dex */
public interface IBundleCoverage extends ICoverageNode {
    Collection<IPackageCoverage> getPackages();
}
