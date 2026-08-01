package u0;

import com.fortunequest.neontrack.data.FortuneQuestDatabase_Impl;

/* renamed from: u0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0369h extends h0.r {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0369h(FortuneQuestDatabase_Impl fortuneQuestDatabase_Impl, int i) {
        super(fortuneQuestDatabase_Impl);
        this.d = i;
    }

    @Override // h0.r
    public final String l() {
        switch (this.d) {
            case 0:
                return "UPDATE OR ABORT `habits` SET `id` = ?,`title` = ?,`symbolIndex` = ?,`createdAt` = ?,`active` = ? WHERE `id` = ?";
            default:
                return "UPDATE habits SET active = 0 WHERE id = ?";
        }
    }
}
