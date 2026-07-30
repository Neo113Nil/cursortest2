package org.game.play.aviator.gameplay;

/* loaded from: classes3.dex */
public class GameModel {
    private String description;
    private String gameUrl;
    private String iconUrl;
    private String shortTitle;
    private String title;

    public GameModel(String str, String str2, String str3, String str4, String str5) {
        this.title = str;
        this.shortTitle = str2;
        this.description = str3;
        this.iconUrl = str4;
        this.gameUrl = str5;
    }

    public String getTitle() {
        return this.title;
    }

    public String getShortTitle() {
        return this.shortTitle;
    }

    public String getDescription() {
        return this.description;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getGameUrl() {
        return this.gameUrl;
    }
}
