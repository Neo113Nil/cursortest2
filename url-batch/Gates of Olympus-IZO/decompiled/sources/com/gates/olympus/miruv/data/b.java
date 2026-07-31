package com.gates.olympus.miruv.data;

import H2.AbstractC0080b;
import Z1.i;

/* loaded from: classes.dex */
public final class b {
    public static final int $stable = 0;
    private final String description;
    private final int difficulty;
    private final d family;
    private final String id;
    private final String name;
    private final f shape;
    private final int strength;
    private final String summary;
    private final String tip;
    private final String tools;
    private final String uses;

    public b(String str, String str2, d dVar, f fVar, int i3, int i4, String str3, String str4, String str5, String str6, String str7) {
        i.f(str, "id");
        i.f(str2, "name");
        i.f(dVar, "family");
        i.f(fVar, "shape");
        i.f(str3, "summary");
        i.f(str4, "description");
        i.f(str5, "uses");
        i.f(str6, "tools");
        i.f(str7, "tip");
        this.id = str;
        this.name = str2;
        this.family = dVar;
        this.shape = fVar;
        this.strength = i3;
        this.difficulty = i4;
        this.summary = str3;
        this.description = str4;
        this.uses = str5;
        this.tools = str6;
        this.tip = str7;
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.tools;
    }

    public final String component11() {
        return this.tip;
    }

    public final String component2() {
        return this.name;
    }

    public final d component3() {
        return this.family;
    }

    public final f component4() {
        return this.shape;
    }

    public final int component5() {
        return this.strength;
    }

    public final int component6() {
        return this.difficulty;
    }

    public final String component7() {
        return this.summary;
    }

    public final String component8() {
        return this.description;
    }

    public final String component9() {
        return this.uses;
    }

    public final b copy(String str, String str2, d dVar, f fVar, int i3, int i4, String str3, String str4, String str5, String str6, String str7) {
        i.f(str, "id");
        i.f(str2, "name");
        i.f(dVar, "family");
        i.f(fVar, "shape");
        i.f(str3, "summary");
        i.f(str4, "description");
        i.f(str5, "uses");
        i.f(str6, "tools");
        i.f(str7, "tip");
        return new b(str, str2, dVar, fVar, i3, i4, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return i.a(this.id, bVar.id) && i.a(this.name, bVar.name) && this.family == bVar.family && this.shape == bVar.shape && this.strength == bVar.strength && this.difficulty == bVar.difficulty && i.a(this.summary, bVar.summary) && i.a(this.description, bVar.description) && i.a(this.uses, bVar.uses) && i.a(this.tools, bVar.tools) && i.a(this.tip, bVar.tip);
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getDifficulty() {
        return this.difficulty;
    }

    public final d getFamily() {
        return this.family;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final f getShape() {
        return this.shape;
    }

    public final int getStrength() {
        return this.strength;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTip() {
        return this.tip;
    }

    public final String getTools() {
        return this.tools;
    }

    public final String getUses() {
        return this.uses;
    }

    public int hashCode() {
        return this.tip.hashCode() + AbstractC0080b.e(AbstractC0080b.e(AbstractC0080b.e(AbstractC0080b.e(AbstractC0080b.b(this.difficulty, AbstractC0080b.b(this.strength, (this.shape.hashCode() + ((this.family.hashCode() + AbstractC0080b.e(this.id.hashCode() * 31, 31, this.name)) * 31)) * 31, 31), 31), 31, this.summary), 31, this.description), 31, this.uses), 31, this.tools);
    }

    public String toString() {
        return "Joint(id=" + this.id + ", name=" + this.name + ", family=" + this.family + ", shape=" + this.shape + ", strength=" + this.strength + ", difficulty=" + this.difficulty + ", summary=" + this.summary + ", description=" + this.description + ", uses=" + this.uses + ", tools=" + this.tools + ", tip=" + this.tip + ")";
    }
}
