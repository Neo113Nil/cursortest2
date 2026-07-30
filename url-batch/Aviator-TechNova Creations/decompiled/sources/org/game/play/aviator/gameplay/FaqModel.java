package org.game.play.aviator.gameplay;

/* loaded from: classes3.dex */
public class FaqModel {
    private String description;
    private int id;
    private String title;

    public FaqModel(int i, String str, String str2) {
        this.id = i;
        this.title = str;
        this.description = str2;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }
}
