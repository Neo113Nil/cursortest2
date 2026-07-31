# Assets — Celestium Path

## Folder structure

| Folder              | Purpose                                      |
|---------------------|----------------------------------------------|
| `backgrounds/`      | Full-screen backgrounds (e.g. welcome screen) |
| `icons/`            | App icon and UI icons                        |
| `ui/`               | Buttons, panels, other UI graphics           |
| `maze_textures/`    | Optional tile textures for the maze grid     |

## Generating assets

See **`PROMPTS.md`** in this folder for copy-paste prompts to generate:

- **Background** — welcome / full-screen cosmic background
- **App icon** — launcher icon (1024×1024, then export variants)

After adding images, reference them in code (e.g. `AssetImage('assets/backgrounds/welcome_bg.png')`) and ensure the file path is listed in `pubspec.yaml` under `flutter.assets` if not already covered by the folder entry.
