package com.squareup.cash.taptopay.encryption.api;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda28;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;
import net.idrnd.face.iad.capture.internal.d4$$ExternalSyntheticLambda0;

/* loaded from: classes7.dex */
public final class HieroglyphKeyCompatibilityReport {
    public String chipSet;
    public String fingerprint;
    public boolean passedChecks;
    public String securityPatchLevel;
    public long timeConsumption;
    public int keymasterVersion = -1;
    public final LinkedHashSet succeedChecks = new LinkedHashSet();
    public final LinkedHashSet failedChecks = new LinkedHashSet();
    public final LinkedHashSet skippedChecks = new LinkedHashSet();
    public final transient LinkedHashSet exceptions = new LinkedHashSet();

    public final String toString() {
        String str = (String) this.exceptions.stream().map(new d4$$ExternalSyntheticLambda0(new TabToolbarsKt$$ExternalSyntheticLambda28(25))).collect(Collectors.joining(","));
        long j = this.timeConsumption;
        String str2 = this.chipSet;
        String str3 = this.fingerprint;
        String str4 = this.securityPatchLevel;
        int i = this.keymasterVersion;
        boolean z = this.passedChecks;
        StringBuilder m = re$$ExternalSyntheticOutline0.m("HieroglyphKeyCompatibilityReport: version(2.0): timeConsumption(", j, "): timeout(false): fromCache(false): chipSet(", str2);
        Boxes$$ExternalSyntheticOutline1.m(m, "): fingerprint(", str3, "): securityPatchLevel(", str4);
        m.append("): keymasterVersion(");
        m.append(i);
        m.append("): passedChecks(");
        m.append(z);
        m.append("): exceptions(");
        m.append(str);
        m.append("): succeedChecks(");
        m.append(this.succeedChecks);
        m.append("): failedChecks(");
        m.append(this.failedChecks);
        m.append("): skippedChecks(");
        m.append(this.skippedChecks);
        m.append(")");
        return m.toString();
    }
}
