package com.chicken.road.kedbags.data.model;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TreasureEgg.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u000fHÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u0081\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016¨\u00064"}, d2 = {"Lcom/chicken/road/kedbags/data/model/TreasureEgg;", "", "id", "", HintConstants.AUTOFILL_HINT_NAME, "", "tag", "clue", "lore", "rarity", "hatchYear", "glowRating", "roadMile", "keeperPhrase", "colorHex", "", "iconGlyph", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getTag", "getClue", "getLore", "getRarity", "getHatchYear", "getGlowRating", "getRoadMile", "getKeeperPhrase", "getColorHex", "()J", "getIconGlyph", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TreasureEgg {
    public static final int $stable = 0;
    private final String clue;
    private final long colorHex;
    private final int glowRating;
    private final int hatchYear;
    private final String iconGlyph;
    private final int id;
    private final String keeperPhrase;
    private final String lore;
    private final String name;
    private final String rarity;
    private final String roadMile;
    private final String tag;

    public static /* synthetic */ TreasureEgg copy$default(TreasureEgg treasureEgg, int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6, String str7, long j, String str8, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = treasureEgg.id;
        }
        return treasureEgg.copy(i, (i4 & 2) != 0 ? treasureEgg.name : str, (i4 & 4) != 0 ? treasureEgg.tag : str2, (i4 & 8) != 0 ? treasureEgg.clue : str3, (i4 & 16) != 0 ? treasureEgg.lore : str4, (i4 & 32) != 0 ? treasureEgg.rarity : str5, (i4 & 64) != 0 ? treasureEgg.hatchYear : i2, (i4 & 128) != 0 ? treasureEgg.glowRating : i3, (i4 & 256) != 0 ? treasureEgg.roadMile : str6, (i4 & 512) != 0 ? treasureEgg.keeperPhrase : str7, (i4 & 1024) != 0 ? treasureEgg.colorHex : j, (i4 & 2048) != 0 ? treasureEgg.iconGlyph : str8);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getKeeperPhrase() {
        return this.keeperPhrase;
    }

    /* renamed from: component11, reason: from getter */
    public final long getColorHex() {
        return this.colorHex;
    }

    /* renamed from: component12, reason: from getter */
    public final String getIconGlyph() {
        return this.iconGlyph;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* renamed from: component4, reason: from getter */
    public final String getClue() {
        return this.clue;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLore() {
        return this.lore;
    }

    /* renamed from: component6, reason: from getter */
    public final String getRarity() {
        return this.rarity;
    }

    /* renamed from: component7, reason: from getter */
    public final int getHatchYear() {
        return this.hatchYear;
    }

    /* renamed from: component8, reason: from getter */
    public final int getGlowRating() {
        return this.glowRating;
    }

    /* renamed from: component9, reason: from getter */
    public final String getRoadMile() {
        return this.roadMile;
    }

    public final TreasureEgg copy(int id, String name, String tag, String clue, String lore, String rarity, int hatchYear, int glowRating, String roadMile, String keeperPhrase, long colorHex, String iconGlyph) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(clue, "clue");
        Intrinsics.checkNotNullParameter(lore, "lore");
        Intrinsics.checkNotNullParameter(rarity, "rarity");
        Intrinsics.checkNotNullParameter(roadMile, "roadMile");
        Intrinsics.checkNotNullParameter(keeperPhrase, "keeperPhrase");
        Intrinsics.checkNotNullParameter(iconGlyph, "iconGlyph");
        return new TreasureEgg(id, name, tag, clue, lore, rarity, hatchYear, glowRating, roadMile, keeperPhrase, colorHex, iconGlyph);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TreasureEgg)) {
            return false;
        }
        TreasureEgg treasureEgg = (TreasureEgg) other;
        return this.id == treasureEgg.id && Intrinsics.areEqual(this.name, treasureEgg.name) && Intrinsics.areEqual(this.tag, treasureEgg.tag) && Intrinsics.areEqual(this.clue, treasureEgg.clue) && Intrinsics.areEqual(this.lore, treasureEgg.lore) && Intrinsics.areEqual(this.rarity, treasureEgg.rarity) && this.hatchYear == treasureEgg.hatchYear && this.glowRating == treasureEgg.glowRating && Intrinsics.areEqual(this.roadMile, treasureEgg.roadMile) && Intrinsics.areEqual(this.keeperPhrase, treasureEgg.keeperPhrase) && this.colorHex == treasureEgg.colorHex && Intrinsics.areEqual(this.iconGlyph, treasureEgg.iconGlyph);
    }

    public int hashCode() {
        return (((((((((((((((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.tag.hashCode()) * 31) + this.clue.hashCode()) * 31) + this.lore.hashCode()) * 31) + this.rarity.hashCode()) * 31) + Integer.hashCode(this.hatchYear)) * 31) + Integer.hashCode(this.glowRating)) * 31) + this.roadMile.hashCode()) * 31) + this.keeperPhrase.hashCode()) * 31) + Long.hashCode(this.colorHex)) * 31) + this.iconGlyph.hashCode();
    }

    public String toString() {
        return "TreasureEgg(id=" + this.id + ", name=" + this.name + ", tag=" + this.tag + ", clue=" + this.clue + ", lore=" + this.lore + ", rarity=" + this.rarity + ", hatchYear=" + this.hatchYear + ", glowRating=" + this.glowRating + ", roadMile=" + this.roadMile + ", keeperPhrase=" + this.keeperPhrase + ", colorHex=" + this.colorHex + ", iconGlyph=" + this.iconGlyph + ")";
    }

    public TreasureEgg(int i, String name, String tag, String clue, String lore, String rarity, int i2, int i3, String roadMile, String keeperPhrase, long j, String iconGlyph) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(clue, "clue");
        Intrinsics.checkNotNullParameter(lore, "lore");
        Intrinsics.checkNotNullParameter(rarity, "rarity");
        Intrinsics.checkNotNullParameter(roadMile, "roadMile");
        Intrinsics.checkNotNullParameter(keeperPhrase, "keeperPhrase");
        Intrinsics.checkNotNullParameter(iconGlyph, "iconGlyph");
        this.id = i;
        this.name = name;
        this.tag = tag;
        this.clue = clue;
        this.lore = lore;
        this.rarity = rarity;
        this.hatchYear = i2;
        this.glowRating = i3;
        this.roadMile = roadMile;
        this.keeperPhrase = keeperPhrase;
        this.colorHex = j;
        this.iconGlyph = iconGlyph;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getClue() {
        return this.clue;
    }

    public final String getLore() {
        return this.lore;
    }

    public final String getRarity() {
        return this.rarity;
    }

    public final int getHatchYear() {
        return this.hatchYear;
    }

    public final int getGlowRating() {
        return this.glowRating;
    }

    public final String getRoadMile() {
        return this.roadMile;
    }

    public final String getKeeperPhrase() {
        return this.keeperPhrase;
    }

    public final long getColorHex() {
        return this.colorHex;
    }

    public final String getIconGlyph() {
        return this.iconGlyph;
    }
}
