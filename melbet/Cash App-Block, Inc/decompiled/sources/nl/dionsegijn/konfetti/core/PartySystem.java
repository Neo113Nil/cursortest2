package nl.dionsegijn.konfetti.core;

import java.util.ArrayList;
import nl.dionsegijn.konfetti.core.emitter.EmitterConfig;
import nl.dionsegijn.konfetti.core.emitter.PartyEmitter;

/* loaded from: classes9.dex */
public final class PartySystem {
    public final ArrayList activeParticles;
    public final long createdAt;
    public final PartyEmitter emitter;
    public final boolean enabled;
    public final Party party;

    public PartySystem(Party party, float f) {
        long currentTimeMillis = System.currentTimeMillis();
        this.party = party;
        this.createdAt = currentTimeMillis;
        this.enabled = true;
        this.emitter = new PartyEmitter(party.emitter, f);
        this.activeParticles = new ArrayList();
    }

    public final boolean isDoneEmitting() {
        PartyEmitter partyEmitter = this.emitter;
        long j = ((EmitterConfig) partyEmitter.emitterConfig).emittingTime;
        ArrayList arrayList = this.activeParticles;
        if (j <= 0 || partyEmitter.elapsedTime < j || arrayList.size() != 0) {
            return !this.enabled && arrayList.size() == 0;
        }
        return true;
    }
}
