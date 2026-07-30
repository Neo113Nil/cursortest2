package org.game.play.aviator.gameplay;

import java.util.List;

/* loaded from: classes3.dex */
public class CategoryModel {
    private String categoryIcon;
    private String categoryName;
    private List<GameModel> games;

    public CategoryModel(String str, String str2, List<GameModel> list) {
        this.categoryName = str;
        this.categoryIcon = str2;
        this.games = list;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public String getCategoryIcon() {
        return this.categoryIcon;
    }

    public List<GameModel> getGames() {
        return this.games;
    }
}
